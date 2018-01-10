public class cercle extends ellipse{
	protected double axe;
	public cercle (double c){
		super(c,c);
	}
	public void changerPaxe(double a){
		this.gaxe=a;
		this.paxe=a;
	}
	public void changerGaxe(double a){
		this.gaxe=a;
		this.paxe=a;
	}
	public String toString() {
		return "Diamètre = "+this.gaxe;
	}
}