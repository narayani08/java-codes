package Assignment15;

import Assignment16.AccessSpecifiers;

class AccessSpecifiersDemo extends AccessSpecifiers { 
	/** * This method accesses the instance variables of the super * class that are declared using different access specifiers */ 
	void view() { 
		/* Instance variable iDefNo has default(package) access in super class and accessible only within the package, but not accessible outside the package */ 
//		System.out.println(iDefNo); 
		/* Instance variable iProNo has protected access in super class and accessible either within the package or within the sub class outside the package, but not accessible in a non sub class outside the package */ 
		System.out.println(iProNo); 
		/* Instance variable iPriNo has private access in super class and not accessible outside the class */ 
//		System.out.println(iPriNo); 
		/* Method with public access specifier can be accessed in all the classes with in the package and outside the package */ 
		display(); 
	} 
	public static void main(String a[]) { 
		AccessSpecifiersDemo object = new AccessSpecifiersDemo(); 
		object.view(); 
	} 
}