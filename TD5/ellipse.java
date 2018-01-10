public class ellipse extends Figure{
	protected double gaxe, paxe;
	public ellipse (double a,double b){
		super(new Point(0,0));
		this.gaxe = a;
		this.paxe = b;
	}
	public double perimetre(){
		return 2*Math.PI*Math.sqrt((Math.pow(this.gaxe,2)+Math.pow(this.paxe,2))/2);
	}
	public double surface(){
		return Math.PI*this.gaxe*this.paxe;
	}
	public void changerGaxe(double a){
		this.gaxe=a;
	}
	public void changerPaxe(double a){
		this.paxe=a;
	}
	public String toString() {
		return "Grand axe = "+this.gaxe+", Petit axe = "+this.paxe;
	}
}