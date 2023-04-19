package koki;

import java.util.Random;

public class pppp {

	Random r = new Random();

	proba odg() {
		
	int vr = (int) (r.nextDouble() * 100);
	if(vr <15)
		 return proba.Plava;
	else if(vr <30)
		 return proba.Crvena;
	else 
		return proba.Zelena;
}
}