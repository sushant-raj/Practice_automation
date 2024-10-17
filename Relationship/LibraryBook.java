package Relationship;

public class LibraryBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib = new Library();
		lib.setName("QSpider");
		System.out.println(lib.getName());
		
		lib.setAddress("BTM");
		System.out.println(lib.getAddress());
		
		lib.b.setBname("Java");
		System.out.println(lib.b.getBName());
		
		lib.b.setCost(234.00);
		System.out.println(lib.b.getCost());
		
		lib.b.setAuthor("James");
		System.out.println(lib.b.getAuthor());

	}

}
