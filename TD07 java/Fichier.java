import java.io.* ;
import java.util.Random ;

class Fichier {

	String nomFichier ;

	Fichier (String nom) {
		nomFichier=nom ;
	}

	public void aleatoire (int n) {
		Random gen = new Random() ;

		try {
			DataOutputStream os = new DataOutputStream(new FileOutputStream(nomFichier)) ;
			for (int i=0 ; i<n ; i++)
				try {
					os.writeInt(gen.nextInt(101)) ;
				} catch (IOException e) {
					System.err.println ("Probleme d'ecriture du "+i+"ème entier") ;
					e.printStackTrace() ;
				}
			os.close() ;
		}
		catch (IOException e){
			System.err.println("Impossible d'ouvrir le fichier") ;
			e.printStackTrace() ;
		}
	}

	public String toString () {
		String res="[" ;
		DataInputStream dis=null ;
		try {
			dis = new DataInputStream (new FileInputStream(nomFichier)) ;
			try {
				while (true) {
					res+=dis.readInt()+" " ;
				}
			} catch(EOFException e){
				res+="]" ;
				try {
					dis.close() ;} 
				catch (IOException a) {
					res="Probleme de fermeture du fichier" ;}
			}
		}
		catch (FileNotFoundException e) {
			res="Fichier inaccessible" ; }
		catch (IOException e) {
			res="Probleme d'entree sortie" ; }
		finally {
			try {
				dis.close() ;} 
			catch (IOException e) {
				res="Probleme de fermeture du fichier" ;}	
		}

		return res ;

	}

	
}	
