package Assignment23;

import java.util.ArrayList;
import java.util.Collections;

public class collections {
	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<>();
		
		if(args.length < 10) System.out.println("Insufficient numbers");
		else {
			try {
				
				for(int i = 0; i < args.length; i++) {
					int num = Integer.parseInt(args[i]);
					ar.add(num);
				}
				Collections.reverse(ar);
				System.out.println(ar);
				
			} catch(Exception e) {
				System.out.println("Not a valid number");
			}
		}
		
	}
}
