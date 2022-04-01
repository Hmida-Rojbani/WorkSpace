
public class Point {

	public int x;
	public int y;
	
	public Point sum( Point p2) {
		Point p3 = new Point();
		p3.x =x + p2.x;
		p3.y =y + p2.y;
		return p3;
	}
	
	public void selfSum( Point p2) {
		
		x =x + p2.x;
		y =y + p2.y;
	}
	
	public void addToX(int x) {
		//this.x = this.x +x;
		this.x+=x;
	}
}
