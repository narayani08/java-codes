package Assignment10;

public class MethodOverloading {
	public int findSquare(int number) {
		return number * number;
	}
	
	public int findSquare(double number) {
		return (int)(number * number);
	}
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		
		System.out.println(obj.findSquare(12));
		System.out.println(obj.findSquare(12.24));
	}
}

