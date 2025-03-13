package Object;

public class Equals {
	int a;
	Equals(){
		
	}
	
	
	Equals(int a){
		this.a=a;
	}
	
	
	public boolean equals(Object o) {
		Equals e=(Equals)o;
		return this.a==e.a;
		
	}
	
	
	public static void main(String[] args) {
		
		Equals t=new Equals(101);
		Equals t1=new Equals(10);
		System.out.println(t.equals(t1));
		
	
		
	}
}
