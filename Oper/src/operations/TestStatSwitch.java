package operations;

public class TestStatSwitch {

	public static void main(String[] args) {
		int i = 6;
		final int j = 2;
		switch (i) {
		default:
			System.out.println("unknown");
			break;
		case 1:
			System.out.println("1");
			break;
		case j:	
		case 3:
			System.out.println(">=2");
			break;
		
		}
		
		String s = "Hi";
		switch (s) {
		case "Hi":
			System.out.println("ok");
			break;

		default:
			break;
		}
	}
}
