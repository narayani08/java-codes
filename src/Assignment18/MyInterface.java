package Assignment18;

public interface MyInterface {

}

class MyClass {}

class MyClass2 extends MyClass implements MyInterface {}

class MyClass3 implements MyInterface {}

class ReferenceDemo {
	public static void main(String[] args) {
		MyClass obj = new MyClass();
		MyClass2 obj2 = new MyClass2();
		MyClass3 obj3 = new MyClass3();
		
//		obj2 = obj3;
//		obj3 = obj2;
		MyInterface interfaceRef = obj3;
//		obj3 = (MyClass3)(obj2);
//		obj2 = obj;
		
	}
}
