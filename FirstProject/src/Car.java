
public class Car {

	String color;
	String type;
	int serialNumber;
	static int carCount;
	
	public Car(String color, String type) {
		super();
		this.color = color;
		this.type = type;
		carCount++;
		this.serialNumber=carCount;
	}
	
	public static void diplayNumberOfCar() {
		int a = 5;
		if(a == 6) {
			int b = 9;
			System.out.println(b);
		}
		System.gc();
		System.out.println(b);
		System.out.println("Number of cars is : "+ carCount);
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", type=" + type + ", serialNumber=" + serialNumber + "]";
	}
	
	
}
