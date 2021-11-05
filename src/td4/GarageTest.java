package td4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GarageTest {
	@Test
	void firstCarByBrandtest() throws CarBrandException {
		Car c = new Car("BmW", 1000);
		Garage g = new Garage();
		g.add(c);
		Car firstCar = g.firstCarByBrand("Peugeot");
    	Assertions.assertNull(firstCar);
	}

}
