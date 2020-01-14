package Assignment3;

public class ArrayCreation {
	int aiArray[];
	
	public ArrayCreation() {
		aiArray = new int[12];
	}
	
	public void arrayValues() {
		for(int i = 0; i < 12; i++) {
			aiArray[i] = i + 1;
		}
	}
	
	public void display() {
		for(int i = 0; i < 12; i++) {
			System.out.println("aiArray[" + i + "]=" + aiArray[i]);
		}
	}
}
