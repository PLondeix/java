import PaD.*;
public class Jeu {
	//public static void main(String[] args) {
	//	for (Couleur c : Couleur.values())
	//		System.out.println(c);
	//}
	public static void main(String[] args) {
		Carte dp = new Carte(Valeur.dame,Couleur.pique);
		Carte st = new Carte(Valeur.sept,Couleur.trèfle);
		System.out.println(dp);
		System.out.println(st);
		System.out.println(dp.compareTo(st));
		PlancheADessin pad = new PlancheADessin();
		dp.dessiner (pad, 0, 0);
		st.dessiner (pad, 100, 0);
	}
}
