package td4;

public class Vehicule {
	private final String marque;
	private final long valeur;
	private Discount discount;
	
	public Vehicule(String m, long v) {
		// TODO Auto-generated constructor stub
		if(v < 0) {
			throw new IllegalStateException("La valeur ne doit pas etre negative") ;
		}
		this.marque = m;
		this.valeur = v;
		this.discount = new Discount(0);
	}
	
	public Vehicule(String m, long v, Discount d) {
		// TODO Auto-generated constructor stub
		if(v < 0) {
			throw new IllegalStateException("La valeur ne doit pas etre negative") ;
		}
		this.marque = m;
		this.discount = d;
		if(d.getValue()==0) this.valeur = v;
		else {
			this.valeur = v;
		}
	}

	public String getMarque() {
		return this.marque;
	}

	public long getValeur() {
		return this.valeur;
	}
	
	public Discount getDiscount() {
		return this.discount;
	}
	
	public String toString() {
		String m;
		m = "Le vehicule de la marque " + this.marque + " a une valeur de " + this.valeur;
		return m;
	}
}
