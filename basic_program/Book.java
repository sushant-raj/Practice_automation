package basic_program;
public class Book {
	static int count;
	 static String title;
	
	Book(String title){
		Book.title=title;		
	}

	public static void main(String[] args) {
		Book b1=new Book("Python");
		System.out.println(b1.count);
		 Book.count=5;
		System.out.println(b1.title);
		Book b2=new Book("java");
		System.out.println(b2.count);
		System.out.println(b2.title);
		Book b3=new Book("c++");
		System.out.println(b3.count);
		System.out.println(b3.title);
		Book b4=new Book("sql");
		System.out.println(b4.count);
		System.out.println(b4.title);
		

	}

}
