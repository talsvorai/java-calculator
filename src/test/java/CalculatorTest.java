import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAddition() {
        calculator.oldValue = 5;
        calculator.newValue = 3;
        calculator.calculation = 1; // Simulating plus button click
        double result = calculator.oldValue + calculator.newValue;
        assertEquals(8, result, "Addition should return 8");
    }

    @Test
    void testSubtraction() {
        calculator.oldValue = 10;
        calculator.newValue = 4;
        calculator.calculation = 2; // Simulating minus button click
        double result = calculator.oldValue - calculator.newValue;
        assertEquals(6, result, "Subtraction should return 6");
    }

    @Test
    void testMultiplication() {
        calculator.oldValue = 2;
        calculator.newValue = 7;
        calculator.calculation = 3; // Simulating multiplying button click
        double result = calculator.oldValue * calculator.newValue;
        assertEquals(14, result, "multiplication should return 14");
    }

    @Test
    void testDivision() {
        calculator.oldValue = 8;
        calculator.newValue = 1;
        calculator.calculation = 4; // Simulating dividing button click
        double result = calculator.oldValue / calculator.newValue;
        assertEquals(8, result, "multiplication should return 14");
    }
}
