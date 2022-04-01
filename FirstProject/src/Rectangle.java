
public class Rectangle {

	public double longeur;
	public double largeur;
	
	public Rectangle() {
		longeur=0;
		largeur=0;
	}
	
	public Rectangle(double longeur, double largeur) {
		this.longeur = longeur;
		this.largeur = largeur;
	}



	public double surface() {
		return largeur*longeur;
	}

	@Override
	public String toString() {
		return "Rectangle [longeur=" + longeur + ", largeur=" + largeur + ", surface()=" + surface() + "]";
	}
	
}
