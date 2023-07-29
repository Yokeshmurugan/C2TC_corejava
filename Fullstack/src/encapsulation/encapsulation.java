package encapsulation;

 class encapsulation {
   private int id;
   private String name;
   private String adress;
   private String number;
public encapsulation(int id, String name, String adress, String number) {
	super();
	this.id = id;
	this.name = name;
	this.adress = adress;
	this.number = number;
}
public encapsulation() {
	super();
	// TODO Auto-generated constructor stub
}
public encapsulation(int id, String name, String adress) {
	super();
	this.id = id;
	this.name = name;
	this.adress = adress;
}
public encapsulation(int id2, String name2, String adress2, int i) {
	// TODO Auto-generated constructor stub
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAdress() {
	return adress;
}
public void setAdress(String adress) {
	this.adress = adress;
}

   public static void main(String[] args) {
	   encapsulation e=new encapsulation(123,"yokesh","panruti");
	   System.out.println(e.getId());
	   System.out.println(e.getName());
	   System.out.println(e.getAdress());
   }
}
