public class Fichier extends Item {
	public Fichier(String nom){
		super(nom);
	}
	public void lister(){
		System.out.println(this.nom);
	}
	public String toString(){
		return "Fichier "+nom;
	}
}