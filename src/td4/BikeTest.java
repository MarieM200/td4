package td4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BikeTest {

	@Test
	void biketest() {
		Discount d = new Discount(0);
		Bike b = new Bike("BMW", d);
		assertEquals("BMW", b.getMarque());
	}

}
