package Assignment13;

public class MultiLevelDemo {

	public static void main(String[] args) {
		
		Person personRefrence;
		
		Trainee trn = new Trainee();
		Employee emp = new Employee();
		
		personRefrence = emp;
		personRefrence.displayDetails();
		
		personRefrence = trn;
		personRefrence.displayDetails();
		
	}
	
}
