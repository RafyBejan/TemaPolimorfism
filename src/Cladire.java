
public class Cladire extends TipProprietate {
	
    public Cladire(Adresa adresa,int suprafata) {
    	super(500,suprafata,adresa);
    }
    public  int impozit() {
    	return getPret()*getSuprafata();
    }
	

}
