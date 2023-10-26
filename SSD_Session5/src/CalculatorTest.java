import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void additionTest() {
		
		Calculator calculator = new Calculator();
		
		int expectedValue = 10 + 20;
		
		assertEquals(expectedValue, calculator.addition(10, 20));
	}
}
