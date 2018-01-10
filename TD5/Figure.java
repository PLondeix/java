public abstract class Figure {
	protected Point po;
	Figure (Point p){
		po=p;
	}
	public abstract double perimetre();
	public abstract double surface();
}