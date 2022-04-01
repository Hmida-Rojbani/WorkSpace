package operations;

public class TestStat {
	public static void main(String[] args) {
		int hour = 7;
		
			if(hour < 8) {
				System.out.println("it is early");
				System.out.println("it is early");
			}
			else
				if(hour < 11) 
					System.out.println("good morning");
				else
					System.out.println("Good afternoon");
			
			int x;
			int y = 10;
			if(y < 8) {
				x = 2*y;
			} else {
				x = 3*y;
			}
			
			x = y < 8 ? 2 *y : 3 * y;
		
	}
}
