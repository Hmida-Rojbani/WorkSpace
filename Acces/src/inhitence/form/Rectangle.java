package inhitence.form;

public class Rectangle extends FormGeo{

	double cote1, cote2;

	public Rectangle(double cote1, double cote2) {
		super();
		this.cote1 = cote1;
		this.cote2 = cote2;
	}
	
	double getSurface() {
		return 0;
	}
}
