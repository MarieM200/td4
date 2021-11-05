package td4;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarTest2 {
	@Test
	void removetest() {
		Car c = new Car("BmW", 1000);
		Garage g = new Garage();
		g.add(c);
		g.remove(c);
		assertEquals(0, g.getCars().size());
	}
}
