package bird;

public class Bird {
	
	private String name = "birdy";
	String type="Canary";
	protected String note ="something";
	
	private void sayName() {
		System.out.println("My name is : "+name);
	}

	public void call() {
		sayName();
	}
}
