public class Rectangle extends Figure {
	protected double longueur, largeur;
	public Rectangle (double a,double b){
		super(new Point(0,0));
		this.longueur = a;
		this.largeur = b;
	}
	public double perimetre(){
		return 2*this.longueur+2*this.largeur;
	}
	public double surface(){
		return this.longueur*this.largeur;
	}
	public void changerLongueur(double a){
		this.longueur=a;
	}
	public void changerLargeur(double a){
		this.largeur=a;
	}
	public String toString() {
		String str = "+";
		for(int i=0;i<longueur;i++){
			str+="--";
		}
		str+="+\n";
		for(int i=0;i<largeur;i++){
			str+="|";
			for(int j=0;j<longueur;j++){
				str+="  ";
			}
			str+="|\n";
		}
		str+="+";
		for(int i=0;i<longueur;i++){
			str+="--";
		}
		str+="+";
		return str;
	}
}