package Assignment11;

public class ConstructorOverload {
	int no1, no2;
	
	public ConstructorOverload(int number) {
		no1 = number;
		System.out.println("Constructor with one argument");
		System.out.println("No1 " + no1 + " " + "No2:" + no2);
	}
	
	public ConstructorOverload(int num1, int num2) {
		no1 = num1;
		no2 = num2;
		System.out.println("Constructor with two argumnets");
		System.out.println("No1:" + no1 + " " + "No2:" + no2);
	}
	
	public ConstructorOverload() {
		System.out.println("Default Constructor");
		System.out.println("No1:" + no1 + " " + "No2:" + no2);
	}
}
