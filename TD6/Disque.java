public class Disque extends Item {
	public Item [] sfw= new Item [1000];
	private int indice_libre=0;
	public Disque(String nom){
		super(nom);
	}
	public void ajouter(Item i){
		sfw[indice_libre]=i;
		indice_libre+=1;
	}
	public void lister(){
		for(int i=0;i<indice_libre;i++){
			System.out.println(sfw[i]);
		}
	}
	public String toString(){
		return "Disque "+nom+" :";
	}
}