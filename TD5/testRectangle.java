public class testRectangle {
	public static void main(String[] args) {
		Figure[] tf = new Figure[4];
			tf[0] = new ellipse(4,2);
			tf[1] = new Rectangle(8,3);
			tf[2] = new carre(4);
			tf[3] = new cercle(4);
		for (Figure f : tf){
			System.out.println("Périmètre : "+f.perimetre()+". Surface : "+f.surface()+".");
		}
	}
}