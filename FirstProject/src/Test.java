
public class Test {
	
	public static void main(String[] args) {
		System.out.println("hello "+args[0]);
		Point p = new Point();
		p.x=8;
		p.y=2;
		System.out.println("Point 1 : "+p.x+", "+p.y);
		Point p2= new Point();
		p2.x=9;
		p2.y=10;
		
		Point p4 = p.sum(p2);
		System.out.println("Point 4 : "+p4.x+", "+p4.y);
		
		p4.selfSum(p2);
		
		System.out.println("Point 4 : "+p4.x+", "+p4.y);
		
		p.addToX(10);
		System.out.println("Point 1 : "+p.x+", "+p.y);
	}

}
