package td4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DiscountTest {

	@Test
	void getValuetest() {
		Discount t = new Discount(1000);
		assertEquals(1000, t.getValue());
	}

}
