package salairy;

public class Developper extends Employee {

	private int nbHour = 40;
	private double hourPrice = 30;
	
	public double calculSalary() {
		
		return nbHour * hourPrice;
	}
	
	public void printDev() {
		
	}

	public void printType() {
		System.out.print("Developper");
		System.out.print(" but I am also ");
		super.printType();
	}
}
