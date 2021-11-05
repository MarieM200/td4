package td4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class Garage{
	private ArrayList<Vehicule> vehicules = new ArrayList();
	private static int id;
	
	public Garage() {
		// TODO Auto-generated constructor stub
		this.id ++;
	}
	
	public void add(Vehicule v) {
		v = Objects.requireNonNull(v);
		this.vehicules.add(v);
		Collections.sort(this.vehicules, new LexicoComparator());
		Collections.sort(this.vehicules, new SortGarage());
	}
	
	public int getId() {
		return this.id;
	}
	
	public ArrayList<Vehicule> getVehicules(){
		return this.vehicules;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("Garage numero ");
		sb.append(this.id);
		sb.append(" possède les vehicules : ");
		sb.append(this.vehicules);
		return sb.toString();
	}
	
	public long valeurTotale() {
		int i;
		long v = 0;
		for(i=0; i<this.vehicules.size(); i++) {
			v = v + this.vehicules.get(i).getValeur();
		}
		return v;
	}
	
	public Vehicule firstCarByBrand(String brand) {
		int i;
		String b;
		for(i=0; i<this.vehicules.size(); i++) {
			b = this.vehicules.get(i).getMarque();
			if(b.equals(brand)) return this.vehicules.get(i);
		}
		//throw new CarBrandException("Il n'y a pas de voitures de cette marque dans ce garage");
		return null;
	}
	
	public void remove(Vehicule v){
		int i;
		for(i=0; i<this.vehicules.size(); i++) {
			if(this.vehicules.get(i).equals(v)) this.vehicules.remove(this.vehicules.get(i));
		}
	}
	
	public void protectionism(String brand) {
		int i;
		ArrayList<Vehicule> aRetirer = new ArrayList();
		for(i=0; i<this.vehicules.size(); i++) {
			if(this.vehicules.get(i).getMarque()==brand) aRetirer.add(this.vehicules.get(i));
		}
		for(Vehicule v : aRetirer) {
			this.remove(v);
		}
	}
}
