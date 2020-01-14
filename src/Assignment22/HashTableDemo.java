package Assignment22;

import java.util.Hashtable;

public class HashTableDemo {
	
	public static void main(String[] args) {
		Hashtable<String, String> table = new Hashtable<>();
		
		table.put("Delhi", "India");
		table.put("Frankfurt", "Germany");
		table.put("Zurich", "Switzerland");
		table.put("California", "USA");
		table.put("Toronto", "Canada");
		table.put("Kolkata", "India");
		table.put("Berlin", "Germany");
		table.put("Paris", "France");
		table.put("Illinois", "USA");
		table.put("Vancouver", "Canada");
		
		
		for(int i = 0; i < 10; i++) {
			if(!table.containsKey(args[i])) {
				System.out.println("Not in the table");
			} else {
				System.out.println(table.get(args[i]));
			}
		}
	}

}
