package td4;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GarageTest3 {

	@Test
	void protectionismtest() {
		Discount disc = new Discount(0);
		Car c1 = new Car("BMW", 4, disc);
		Car c2 = new Car("Renaud", 3, disc);
		Car a = new Car("Audi",10000, disc);
		Car b = new Car("BMW",9000, disc);
		Car c = new Car("BMW",9000, disc);
		Bike b1 = new Bike("Renaud", disc);
		Bike b2 = new Bike("Pegeot", disc);
		Garage g = new Garage();
		Garage g2 = new Garage();
		g.add(c1);
		g.add(c2);
		g.add(a);
		g.add(b);
		g.add(c);
		g.add(b1);
		g.add(b2);
		g2.add(c2);
		g2.add(a);
		g2.add(b1);
		g2.add(b2);
		g.protectionism("BMW");
		assertEquals(g.getVehicules(), g2.getVehicules());
	}

}
