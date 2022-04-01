package salairy;

public class Main {

	public static void printEmployeeType(Employee e) {
		e.printType();
		if(e instanceof Manager)
			System.out.println("I am the BOSS");
	}

	public static void main(String[] args) {
		Developper developper = new Developper();
//		developper.printSalary();
		Manager manager = new Manager();
		printEmployeeType(developper);
		printEmployeeType(manager);
//		manager.printSalary();
//		Employee e = new Developper();
//		Employee e2 = new Manager();
//		developper.printDev();
//		Employee[] emps = new Employee[3];
//		emps[0]=developper;
//		emps[1]=manager;
//		
//		for (int i = 0; i < emps.length; i++) {
//			emps[i].printSalary();
//		}
	}

}
