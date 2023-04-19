package kostana.maksic;

public class Main {

	public static void main(String[] args) {
		
/* Sva nabrajanja imaju dve unapred definisane metode:
 * valeus() - vraca niz koji sadrzi niz konstanti definisanih u nabrajanju
 * valeusOf() - vraca konstantnu iz nabrajanja cija vrednost odgovara
 * znakovnom niz prosledjenom u argumentu
 * 
 */
		Boja b;
		System.out.println("Boje: ");
		
		Boja nizBoja[] = Boja.values();
		
		for( Boja c : nizBoja) {
		System.out.println(c + " ");
		}
		Boja c1;
		c1 = Boja.valueOf("Bela"); //vraca vrednost iz nabrajanja koja odgovoara 
		//imenu zadate konstante
		System.out.println("Boja: " + c1);
		
	}
}

