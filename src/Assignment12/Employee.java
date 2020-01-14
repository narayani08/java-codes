package Assignment12;

public class Employee extends Person{

	int empNo;
	double salary;
	
	public Employee(int empId, String name, int day, int month, int year, double salary) {
		super(name, day, month, year);
		empNo = empId;
		this.salary = salary;
	}
	
	public void displayDetails() {
		super.displayDetail();
		System.out.println("Employee Id :: " + empNo);
		System.out.println("Salary: " + salary);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person objPerson = new Person("Sanjay", 10, 11, 1967);
		Employee objEmployee = new Employee(111, "Dennis", 21, 03, 2001, 48000);
		objEmployee.displayDetail();
		
		objPerson = objEmployee;
		objPerson.displayDetail();
	}
}
