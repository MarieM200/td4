package td4;

public class Bike extends Vehicule{
	
	public Bike(String m) {
		// TODO Auto-generated constructor stub
		super(m, 100);
	}
	
	public Bike(String m, Discount d) {
		// TODO Auto-generated constructor stub
		super(m, 100, d);
		if(d.getValue()!=0) {
			throw new IllegalStateException("Il n'y a pas de réduction pour les vélos") ;
		}
	}
	
	
}
