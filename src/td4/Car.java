package td4;

public class Car extends Vehicule{
	private final int vetuste;
	
	public Car(String b, long val) {
		// TODO Auto-generated constructor stub
		super(b, val);
		this.vetuste = 0;
	}
	
	public Car(String b, long val, Discount d) {
		// TODO Auto-generated constructor stub
		super(b, val, d);
		this.vetuste = 0;
	}
	
	public Car(String b, long val, int ves) {
		// TODO Auto-generated constructor stub
		super(b, val - 1000*ves);
		this.vetuste = ves;
	}
	
	public Car(String b, long val, int ves, Discount d) {
		// TODO Auto-generated constructor stub
		super(b, val - 1000*ves, d);
		this.vetuste = ves;
	}
	
	public int getVetuste() {
		return this.vetuste;
	}
	
	public String toString() {
		String m;
		m = super.toString() + " Il a une vetuste de " + this.vetuste;
		return m;
	}
	
	public boolean equals(Car c) {
		if (c.getMarque()==super.getMarque() && super.getValeur()==c.getValeur() && this.vetuste==c.getVetuste()) return true;
		return false;
	}
}
