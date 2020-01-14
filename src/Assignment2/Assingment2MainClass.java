package Assignment2;
public class Assingment2MainClass {
	public static void main(String[] args) {
		Assignment2StudentClass obj = new Assignment2StudentClass();
		obj.setMarks(40, 80, 75);
		int[] results = obj.getMarks();
		System.out.println("THE FINAL GRADE IS " + obj.getResult());
	}
}
