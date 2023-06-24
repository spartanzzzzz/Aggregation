package com.obsqura.aggregation.student;

public class Student {
	int rollNo;
	String name;
	Address address;
	public Student(int rollNo, String name, Address address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}
	
	public void display() {
		System.out.println("Student details");
		System.out.println(name +" "+ rollNo);
		System.out.println(address.houseName +" " +address.city +" "+ address.state +" "+ address.pin);
	}
	
	public static void main(String[] args) {
		Address address1 = new Address("Premnivas","Thiruvalla","Kerala", 689107);
		Student st = new Student(27,"Praveen",address1);
		st.display();
	}
}
	
	


