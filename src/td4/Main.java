package td4;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
	
	public static void main(String[] args) throws CarBrandException {
		// TODO Auto-generated method stub
		Discount disc = new Discount(0);
		Car c1 = new Car("BMW", 4, disc);
		Car c2 = new Car("Renaud", 3, disc);
		Car a = new Car("Audi",10000, disc);
		Car b = new Car("BMW",9000, disc);
		Car c = new Car("BMW",9000, disc);
		Car d = a;
		Bike b1 = new Bike("Renaud", disc);
		Bike b2 = new Bike("Pegeot", disc);
		
		Garage g = new Garage();
		g.add(c1);
		g.add(c2);
		g.add(a);
		g.add(b);
		g.add(c);
		g.add(d);
		g.add(b1);
		g.add(b2);
		System.out.println(g.toString());
		g.protectionism("BMW");
		System.out.println(g.toString());
		/*System.out.println(g.valeurTotale());
		System.out.println(g.firstCarByBrand("Peugeot"));
		
		
		System.out.println(a==b);
		System.out.println(b==c);
		System.out.println(a==d);
		System.out.println(a.equals(b));
		System.out.println(b.equals(c)); // la logique veut que ça affiche true
		System.out.println(a.equals(d));
		
		ArrayList<Car> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		System.out.println(list.indexOf(a));
		System.out.println(list.indexOf(b));
		System.out.println(list.indexOf(c));//la logique veut que ça affiche null
		System.out.println(b.equals(c));
		
		HashSet<Car> set = new HashSet<Car>();
		set.add(b);
		System.out.println(set.contains(c));*/
	}

}
