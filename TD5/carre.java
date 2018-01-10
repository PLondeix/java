public class carre extends Rectangle{
	protected double cote;
	public carre (double c){
		super(c,c);
	}
	public void changerLongueur(double a){
		this.longueur=a;
		this.largeur=a;
	}
	public void changerLargeur(double a){
		this.largeur=a;
		this.longueur=a;
	}
}