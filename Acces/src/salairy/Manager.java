package salairy;

public class Manager extends Employee{
	private double baseSalary = 2400;
	private double bounus = 2000;
	@Override
	public double calculSalary() {
		// TODO Auto-generated method stub
		return baseSalary + bounus;
	}

	public void printType() {
		System.out.println("Manager");
	}
}
