package com.pk;

public class API842 {
	
	private String empId;
	private String name;
	private String city;
	
		
	public API842(String empId, String name, String city) {
		super();
		this.empId = empId;
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Details:  [EmpId=" + empId + ", name=" + name + ", city=" + city + "]";
	}

	public static void main(String[] args) {
		
		API842 obj = new API842("API842", "Vaishnavi","Dehradun");
		System.out.println(obj.toString());	
	}

}
