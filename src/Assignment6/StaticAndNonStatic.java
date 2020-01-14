package Assignment6;

public class StaticAndNonStatic {
	static int iStatic;
	char choice;
	
	StaticAndNonStatic(char choice) {
		iStatic++;
		this.choice = choice;
	}
	
	static void displayObjectCount() {
		System.out.println("Value of iStatic " + iStatic);
	}
	
	void displayUserChoice() {
		System.out.println("The user choice is " + this.choice);
	}
}
