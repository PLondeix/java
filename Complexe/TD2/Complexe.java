public class Complexe {
	private double réel ;
	private double img ;
	public Complexe() {
		réel=0;
		img=0;
	}
	public String toString () {
		return "(" + this.réel + "," + img + ")" ;
	}
	public Complexe(double pr, double pi) {
		this.réel=pr;
		this.img=pi;
	}
	final static Complexe I = new Complexe(0,1);
	public double partieReelle() {
		return this.réel;
	}
	public double partieImaginaire() {
		return this.img;
	}
	public double rho() {
		return Math.pow(Math.pow(this.réel,2)+Math.pow(this.img,2),0.5);
	}
	public double theta() {
		return Math.atan2(this.img,this.réel);
	}
	public static Complexe polComplexe(double n, double p) {
		Complexe F = new Complexe(n*Math.cos(p),n*Math.sin(p));
		return F;
	}
}
