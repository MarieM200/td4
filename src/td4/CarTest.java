package td4;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarTest {
	@Test
	void Vetustetest() {
		Car c = new Car("BmW", 4000, 2);
		assertEquals(2000, c.getValue());
	}
	
	@Test
	void Exceptiontest() {
		Assertions.assertThrows(CarBrandException.class, () -> {
		    Car c = new Car ("BmW", -4);
		 });
	}

}
