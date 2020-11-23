package com.pk;
class pooja{
	String emp_id;
	String name;
	String address;
	Long  phone_no;
	public pooja(String emp_id, String name, String address, Long phone_no) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.address = address;
		this.phone_no = phone_no;
	}
	@Override
	public String toString() {
		return "pooja [emp_id=" + emp_id + ", name=" + name + ", address=" + address + ", phone_no=" + phone_no + "]";
	}
	
	
}
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("hello my name is mahesh karad");
	    System.out.println("Hello from Vivek Doshi");
	    Vivek v=new Vivek("Vivek",1,"Noida");
	    System.out.println(v);
	    
	    System.out.println("Hello from Rakshit Jain");
	    System.out.println("Hello from Ramakant!");
	    System.out.println("Hello from Vaishnavi!!");

	    System.out.println("hello my name is pooja");
	    pooja obj=new pooja("API882","Pooja Kashiramka","nihali chawk, Pilani",8209925607L);
	    System.out.println(obj.toString());
	   

	    System.out.println("Hello from Mousam");
	    mousam m = new mousam("Mousam",101,"Bangalore");
	    System.out.println("Mousam :  " + m);
	    //branch 'master' of https://github.com/mahesh-karad/17nov.git
	}

}
