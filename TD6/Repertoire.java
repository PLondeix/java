public class Repertoire extends Item{
	private Item [] sfr = new Item [1000];
	private int indice_libre=0;
	public Repertoire(String nom){
		super(nom);
	}
	public void ajouter(Item i){
		sfr[indice_libre]=i;
		indice_libre+=1;
	}
	public void lister(){
		for(int i=0;i<indice_libre;i++){
			System.out.println(sfr[i]);
		}
	}
	public String toString(){
		return "Repertoire "+nom+" :";
	}
}