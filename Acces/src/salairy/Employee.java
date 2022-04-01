package salairy;

public abstract class Employee extends Object{

	public abstract double calculSalary();
	
	public void printSalary() {
		System.out.println("Salary is :"+calculSalary());
	}
	
	public void printType() {
		System.out.println("Employee");
	}
	
}
