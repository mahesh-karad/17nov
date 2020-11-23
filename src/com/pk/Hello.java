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
	    System.out.println("Hello from Rakshit Jain");
	    System.out.println("Hello from Ramakant!");
	    System.out.println("Hello from Vaishnavi!!");
	    System.out.println("hello my name is pooja");
	    pooja obj=new pooja("API882","Pooja Kashiramka","nihali chawk, Pilani",8209925607L);
	    System.out.println(obj.toString());
	   
	}

}
