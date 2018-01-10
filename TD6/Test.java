public class Test {
	public static void main(String[] args) {
		Repertoire rep = new Repertoire("rep1");
		Disque dis = new Disque("dis1");
		Fichier file = new Fichier("file1");
		Fichier file2 = new Fichier("file2");
		rep.ajouter(file);
		rep.ajouter(file2);
		//rep.lister();
		dis.ajouter(rep);
		dis.lister();

	}
}