
public abstract class TipProprietate {
  private int pret,suprafata;
  private Adresa adresa;
  
  public TipProprietate(int pret, int suprafata, Adresa adresa) {
	this.pret = pret;
	this.suprafata = suprafata;
	this.adresa = adresa;
}

public int getPret() {
	return pret;
}

public int getSuprafata() {
	return suprafata;
}

public Adresa getAdresa() {
	return adresa;
}
  public abstract int impozit();
  
  public String afisarefluturas() {
	  return "\n  "+getClass().getName()+":"+adresa.getStrada()+"Numarul"+adresa.getNumar()+"\n Suprafata  "+ this.getSuprafata()+ "\n  Pretul:"+this.impozit()+"\n";
  }
  
  
}
