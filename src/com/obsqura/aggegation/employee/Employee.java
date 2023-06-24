package com.obsqura.aggegation.employee;

public class Employee {
	String empName;
	int empId;
	Car car;
	

	public Employee(String empName, int empId, Car car) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.car = car;
	}
	public void display() {
		System.out.println("Employee details");
		System.out.println(empName +" "+ empId);
		System.out.println(car.carName +" " + car.colour +" "+ car.regNo);
	}


	public static void main(String[] args) {
		Car car1 = new Car("Volkswagen Virtus", "Carbon Steel Grey", "KL27F3823");
		Employee emp = new Employee("Praveen",5456, car1);
		emp.display();
	
	}

}
