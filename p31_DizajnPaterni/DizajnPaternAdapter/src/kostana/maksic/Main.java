package kostana.maksic;

public class Main {
	
	public static void main(String[] args) { 
		
		DivljaPatka patka = new DivljaPatka(); 
		Curka curka = new DivljaCurka(); 
		
		// Umotavamo Curku u CurkaAdapter, zahvaljujuci kome ce izgledati kao Patka 
		
		Patka curkaAdapter = new CurkaAdapter(curka); 
		
		System.out.println("Curka: "); 
		curka.curlice();
		curka.leti(); 
		System.out.println("\nPatka: "); 
		
		testPatka(patka); 
		
		// Pokusavamo da poturimo Curku kao Patku 
		System.out.println("AdapterCurka"); 
		testPatka(curkaAdapter); // ne zna da je dobila Curku prerusenu u Patku } 
	}
		static void testPatka(Patka patka) { 
		patka.kvace();
		patka.leti();
		}
	}
