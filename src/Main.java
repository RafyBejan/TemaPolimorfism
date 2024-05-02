
public class Main {

	public static void main(String[] args) {
	
		
		Vagon v1=new CalatoriA();
		Vagon v2=new CalatoriB();
		Vagon v3=new Marfar();
		
		Tren t1=new Tren();
		Tren t2=new Tren();
		Tren t3=new Tren();
		
		t1.adaugareVagoane(v3);
		t1.adaugareVagoane(v2);

		t2.adaugareVagoane(v1);
		
		t3.adaugareVagoane(v3);
	
		
		
		System.out.println("Numarul total de colete postale pentru trenul t1: " + t1.numarcoletepostale());
	
		
		
		
		

	}

}
