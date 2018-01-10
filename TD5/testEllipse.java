public class testEllipse {
	public static void main(String[] args) {
		ellipse r = new ellipse(3,2);
		System.out.println(r.perimetre());
		System.out.println(r.surface());
		r.changerGaxe(4);
		System.out.println(r.perimetre());
		System.out.println(r.surface());
	}
}