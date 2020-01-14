package Assignment37;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PushbackInputStream;

public class PushBackInputStreamDemo {
	public static void main(String[] args) throws IOException {
		
		String data = "This Is Java Input/Output";
		
		OutputStream out = new FileOutputStream("C:\\Users\\narayani bharti\\eclipse-workspace\\JAVA\\src\\Assignment37\\input.txt");
		
		try {
			ByteArrayInputStream br = new ByteArrayInputStream(data.getBytes());
			PushbackInputStream push = new PushbackInputStream(br);
			ByteArrayOutputStream brOut = new ByteArrayOutputStream();
			int i = push.read();
			push.unread(i + 32);
			byte b[] = new byte[data.getBytes().length];
			push.read(b);
			brOut.write(b);
			brOut.writeTo(out);
			System.out.println(new String(b));
		} catch(Exception e) {
			System.out.println(e);
		} 
		
	}
}
