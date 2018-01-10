enum Couleur {trèfle, carreau, coeur,pique}
enum Valeur {deux(2), trois(3),  quatre (4), cinq(5), six(6), sept(7),   huit(8), neuf(9), dix(10),
valet (10),  dame (10), roi(10), as (20);
Integer  valeur;
Valeur(Integer v) { valeur = v; }
Integer  valeur () {return valeur; }
}
public class Test {
	public static void main(String[] args) {
		for (Valeur c : Valeur.values())
			System.out.println(c+":"+c.valeur());
	}
}
