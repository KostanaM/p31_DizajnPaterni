package kostana.maksic;
//String(char chars[], int startIndex, int numChars)
public class S2 {

	public static void main(String[] args) {

		char ch[] = {'J', 'A', 'V','A'};
		String s = new String(ch, 2, 2);
		
		System.out.println(" String = " + s);
		
		//String s1 = 2023; //Greska
		String s1 = "" + 2015;
		
		System.out.println(" String = " + s1);

	}

}
