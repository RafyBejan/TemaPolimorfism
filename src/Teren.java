
public class Teren extends TipProprietate {
   private RangulLocalitati rangulLocatiei;

public Teren(int pret, int suprafata, Adresa adresa, RangulLocalitati rangulLocatiei) {
	super(300, suprafata, adresa);
	this.rangulLocatiei = rangulLocatiei;
}

@Override
public int impozit() {
      return this.getPret()*this.getSuprafata()/rangulLocatiei.getRang();
	
}

   
}
