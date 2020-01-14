package Assignment6;

public class StaticAndNonStaticDemo {
	public static void main(String[] args) {
		System.out.println("Before creating object");
		StaticAndNonStatic.displayObjectCount();
		
		System.out.println("After creating object");
		StaticAndNonStatic obj = new StaticAndNonStatic('N');
		
		StaticAndNonStatic.displayObjectCount();
		obj.displayUserChoice();
	}
}
