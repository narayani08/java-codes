package Assignment32;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferingIO {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("C:\\Users\\narayani bharti\\eclipse-workspace\\JAVA\\src\\Assignment32\\input.txt");
		BufferedInputStream bin = new BufferedInputStream(fin);
				
		System.out.println("File Contents");
		int ch;
		
		while((ch=bin.read()) != -1) {
			System.out.print((char)ch);
		}
		System.out.println("Writing into the file");
		
		FileOutputStream fout = new FileOutputStream("C:\\Users\\narayani bharti\\eclipse-workspace\\JAVA\\src\\Assignment32\\input.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		
		byte b[] = "This string has been written by ByteOutputStream".getBytes();
		
		bout.write(b);
		
		bout.flush();
		
		bin.close();
		fin.close();
		bout.close();
		fout.close();
	}
	
}
