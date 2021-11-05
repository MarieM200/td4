package td4;

import java.util.Comparator;

public class SortGarage implements Comparator<Vehicule>{
	public int compare(Vehicule a, Vehicule b)
    {
		long v = 0;
		if(a instanceof Car && b instanceof Car) {
			Car c = (Car) a;
			Car d = (Car) b;
    		v = c.getVetuste() - d.getVetuste();
    	}
		v = v + a.getValeur() - b.getValeur();
		int i = (int) v;
        return i;
    }
}
