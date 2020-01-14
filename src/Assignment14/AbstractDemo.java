package Assignment14;

public abstract class AbstractDemo {
	protected static int count;
	private int number;
	
	abstract void getValues();
	final void displayValue() {
		
	}
//	final void compute() {}
	
	void incrementCount() { count++; }
	void incrementCounter() { number++; }
}
