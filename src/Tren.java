import java.util.ArrayList;

public class Tren {
    ArrayList<Vagon> listaVagoanelor;

	public Tren(ArrayList<Vagon> listaVagoanelor) {
		this.listaVagoanelor = listaVagoanelor;
	
	}
	public Tren() {
        this.listaVagoanelor = new ArrayList<>();
    }
	public boolean adaugareVagoane(Vagon v) {
		if(listaVagoanelor.size()<=15) 
			return listaVagoanelor.add(v);
		else
			System.out.println("Sunt prea multe vagoane");
			return false;
		
	}
	public int  numarcoletepostale() {
		int sum=0;
		for(Vagon vagon : listaVagoanelor) {
			sum=sum+vagon.getColetePostale();
		}
		return sum;
		
	}
	public boolean equals(Tren t) {
		if(this.numarcoletepostale()==t.numarcoletepostale())
		{
			System.out.println("Trenurile sunt egale");
			return true;
		}
		return false;
	}
	
	
    
 
}
