public class Eq2Degré {
    private static final double epsilon=1E-10;
    private Complexe rac1, rac2;
    private double D;
    public Eq2Degré(double a, double b, double c) {
	//	this.a=a;
	//	this.b=b;
	//	this.c=c;
	if (a!=0) {
        
	    résoudre(a,b,c);
	}
	else {
	    System.out.println("Error : a=0");
	}
    }  
    private void résoudre(double a, double b, double c) {
	    //this.a=a;
	    // this.b=b;
	    // this.c=c;
	    D=b*b-4*a*c;
	    if( (D) >=0) {		
		rac1=new Complexe((-b-(Math.pow(D,1/2))/(2*a)),0);
	        rac2=new Complexe((-b+(Math.pow(D,1/2))/(2*a)),0);
	        
	    }
	    else {
		rac1= new Complexe(-b/(2*a), -(Math.pow(D,1/2)/(2*a)));
		rac2= new Complexe(-b/(2*a), Math.pow(D,1/2)/(2*a));
	    }
    }
    
    public Complexe premiereRacine() {
	return rac1;
    }
    public Complexe secondeRacine() {
	return rac2;
    }
    public String toString() {
	return rac1.partieReelle()+"+"+rac1.partieImaginaire()+"i"+" or "+rac2.partieReelle()+"+"+rac2.partieImaginaire()+"i";
    }
}
    
