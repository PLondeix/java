import PaD.*;
public class Jeu52 {
	private Carte[] jeu; 

	public Jeu52() {
		int i =0;
		Carte[] jeu = new Carte[52];
		for (Couleur c: Couleur.values()) {
			for (Valeur v: Valeur.values()){
				jeu[i]=new Carte(v,c);
				i++;
			}
		}
		String nom = "Mon jeu de poker";

	}
	public String toString () {
		
		for (int a=0; a<52; a++){
			String tCarte=tCarte+"["+Carte[a].valeur+"("+Carte[a].valeur.valeur+")"+","+Carte[a].couleur+"]";
		}
		return tCarte;
	}

}
