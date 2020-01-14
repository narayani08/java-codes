package Assignment12;

public class Person {
	String name;
	int day, month, year;
	
	public Person(String temp, int d, int m, int y) {
		name = temp;
		day = d;
		month = m;
		year = y;
	}
	public void displayDetail() { 
		System.out.println("DOJ :: " + day + "-" + month + "-" + year);
	}
}
