enum Couleur {trèfle, carreau, coeur,pique}

enum Valeur {deux(2), trois(3),  quatre (4), cinq(5), six(6), sept(7),   huit(8), neuf(9), dix(10),
valet (10),  dame (10), roi(10), as (20);
Integer  valeur;
Valeur(Integer v) { valeur = v; }
Integer  valeur () {return valeur; }
}

public class Carte {
	private Couleur couleur;
	private Valeur  valeur;
	private PaD.Image img;
	public Carte (Valeur v, Couleur c) {
		this.valeur=v;
		this.couleur=c;
		this.img= new PaD.Image ("/home/user/TD3/Cartes/"+v+"-"+c+".gif");
	}
	public String toString () {
		return "["+this.valeur+"("+valeur.valeur+")"+","+this.couleur+"]";
	}
	public int compareTo(Carte c) {
		return this.valeur.valeur - c.valeur.valeur;
	}
	public void dessiner (PaD.PlancheADessin pad, double x, double y) {
		img.setOrig(x,y);
		pad.ajouter(img);
	}
}
