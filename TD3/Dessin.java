import PaD.*;
public class Dessin {
	public static void main(String[] args) {
		PlancheADessin pad = new PlancheADessin();
		double milieu = pad.getLargeur()/2;

		Dessinable titre = new Texte(milieu-60, 10, "Mon Bonhomme");
		Dessinable tête = new CerclePlein(milieu , 80, 60, PlancheADessin.ROUGE);

		pad.ajouter(titre);
		pad.ajouter(tête);
	}
}