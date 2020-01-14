package Assignment20;

public class StringManipulation {
	public static void main(String[] args) {
		int countW = 0;
		
		for(int i = 0; i < args[0].length(); i++) {
			if(args[0].charAt(i) == 'w' || args[0].charAt(i) == 'W') countW++;
		}
		for(int i = 0; i < args[1].length(); i++) {
			if(args[1].charAt(i) == 'w' || args[1].charAt(i) == 'W') countW++;
		}
		
		System.out.println("Total number of W/w " + countW);
		
		String str1 = args[0].replace('w', 'T');
		str1 = str1.replace('W', 'T');
		String str2 = args[1].replace('w', 'T');
		str2 = str2.replace('W', 'T');
		
		str1 = str1.toUpperCase();
		str2 = str2.toUpperCase();
		
		System.out.println("Concated " + (str1.concat(str2)));
	}
}
