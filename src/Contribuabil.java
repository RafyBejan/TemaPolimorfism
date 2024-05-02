import java.util.ArrayList;

public class Contribuabil {
    private String name,cnp;
    ArrayList<TipProprietate> listaProprietati;
    
	public Contribuabil(String name, String cnp) {
		this.name = name;
		this.cnp = cnp;
		this.listaProprietati = new ArrayList<TipProprietate>();
	}
	public String getName() {
		return name;
	}
	public String getCnp() {
		return cnp;
	}
    
    public boolean adaugareLista(TipProprietate p) {
    	listaProprietati.add(p);
    	return true;
    }
    public int PretulTotal() {
    	int sumtotal=0;
    	for(TipProprietate listaProprietati :listaProprietati) {
    		sumtotal=sumtotal+listaProprietati.impozit();
    	}
    	return sumtotal;
    }
     
    	public String fluturas() {
    		String fluturas = getClass().getName()+": "+this.getName()+ "\n\nProprietati";
    		for (TipProprietate proprietate: listaProprietati){
    			fluturas += proprietate.afisarefluturas();
    		}
    		fluturas += "\nSuma totala: " + this.PretulTotal();
    		return fluturas;
    	}
    }

