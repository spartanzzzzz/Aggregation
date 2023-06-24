package com.obsqura.aggregation.employeedetails;

public class Employee {
	String empName;
	int empId;
	Car car;
	Bike bike;
	
	public Employee(String empName, int empId, Car car, Bike bike) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.car = car;
		this.bike = bike;
	}
	public void display() {
		System.out.println("Employee details");
		System.out.println(empName +" "+ empId);
		System.out.println("Car:" +" "+ car.carName +" " + car.carColour +" "+ car.carRegNo);
		System.out.println("Bike:" +" "+ bike.bikeName +" " + bike.bikeColour +" "+ bike.bikeRegNo);
	}
	public static void main(String[] args) {
		Car car1 = new Car("Volkswagen Virtus", "Carbon Steel Grey", "KL27F3823");
		Bike bike1 = new Bike("Honda CB 350 RS","Matte Massive Grey","KL27C984");
		Employee emp = new Employee("Praveen",5456, car1,bike1);
		emp.display();
		}

}
