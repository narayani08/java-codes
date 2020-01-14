package Assignment4;

public class BookDemo {
	
	Book obj[];
	
	BookDemo() {
		obj = new Book[12];
	}
	
	void createBook() {
		obj[0] = new Book();
		obj[0].setName("Gone with the wind");
		obj[0].setPrice(500);
		
		obj[1] = new Book();		
		obj[1].setName("Java programming");
		obj[1].setPrice(300);
	}
	
	void bookShow() {
		for(int i = 0; i < obj.length; i++) {
			System.out.println(obj[i].getName());
			System.out.println(obj[i].getPrice());
		}
	}
	
	public static void main(String[] args) {
		BookDemo bd = new BookDemo();
		bd.createBook();
		bd.bookShow();
	}
}
