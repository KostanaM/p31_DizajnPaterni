package kostana.maksic;

/* Nabrajanje je vrsta klase. Nema sve osobine klase ali je vrsta klase.Instanca klase 
 * ne pravi se pomocu kljucne rijeci new.
 * Rezervisana rec Enum definise klasu.
 * Svaka konstanta tj. inedniifikator definisan u nbrajanju je objekat ciji
 * tip je to isto nabranje. 
 */

public class Main {

	public static void main(String[] args) {
		
		Boja b;
		
		System.out.println("Udeo zelene boje: " + Boja.Zelena.getUdeo());
		
		System.out.println("Sve boje: ");
		for(Boja c : Boja.values())
			System.out.println(c + ": " + c.getUdeo());	
	}

}
