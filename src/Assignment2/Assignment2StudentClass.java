package Assignment2;

public class Assignment2StudentClass {
	int subject1Marks;
	int subject2Marks;
	int subject3Marks;
	
	void setMarks(int mark1, int mark2, int mark3) {
		this.subject1Marks = mark1;
		this.subject2Marks = mark2;
		this.subject3Marks = mark3;
	}
	
	int[] getMarks() {
		return new int[] {this.subject1Marks, this.subject2Marks, this.subject3Marks};
	}
	
	String getResult() {
		int result = this.subject1Marks + this.subject2Marks + this.subject3Marks;
		result /= 3;
		if(result >= 80 && result <= 100) return "A";
		else if(result >= 73 && result <= 79) return "B+";
		else if(result >= 65 && result <= 72) return "B";
		else if(result >= 55 && result <= 64) return "C";
		else return "D";
	}
	
}
