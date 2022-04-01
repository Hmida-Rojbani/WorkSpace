
public class TestCar {
	
	public static void main(String[] args) {
		Car c = new Car("Black","Ranger");
		Car c2 = new Car("Black","Ranger");
		
		System.out.println(c);
		System.out.println(c2);
		c2=null;
		Car.diplayNumberOfCar();
		
		System.out.println(Math.PI*Math.cos(2.5 ));
		
	}

}
