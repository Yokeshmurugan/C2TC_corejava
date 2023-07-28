package constructor;

public class construct {

	int id;
	String name;
	
	public construct() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public construct(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	
	public void print() {
		System.out.println(name+" id");
	}
	public static void main(String[]args) {
		// TODO Auto-generated constructor stub
		construct c=new construct();
		construct c1=new construct(128,"Yokesh");
		c.print();
		
		c1.print();
	}
}
