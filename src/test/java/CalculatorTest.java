import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Random;

class CalculatorTest {
    private Calculator calculator;
    private final Random random = new Random();

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    //Set random numbers for the tests
    double num_a = random.nextDouble() * 200 - 100;
    double num_b = random.nextDouble() * 200 - 100;

    @Test
    void testAddition() {
        calculator.oldValue = num_a;
        calculator.newValue = num_b;
        double real_result = num_a + num_b;
        calculator.calculation = 1; // Simulating plus button click
        double result = calculator.oldValue + calculator.newValue;
        assertEquals(real_result, result, "Addition should return " + real_result);
    }

    @Test
    void testSubtraction() {
        calculator.oldValue = num_a;
        calculator.newValue = num_b;
        double real_result = num_a - num_b;
        calculator.calculation = 2; // Simulating minus button click
        double result = calculator.oldValue - calculator.newValue;
        assertEquals(real_result, result, "Subtraction should return " + real_result);
    }

    @Test
    void testMultiplication() {
        calculator.oldValue = num_a;
        calculator.newValue = num_b;
        double real_result = num_a * num_b;
        calculator.calculation = 3; // Simulating multiplying button click
        double result = calculator.oldValue * calculator.newValue;
        assertEquals(real_result, result, "multiplication should return " + real_result);
    }

    @Test
    void testDivision() {
        calculator.oldValue = num_a;
        calculator.newValue = num_b;
        double real_result = num_a / num_b;
        calculator.calculation = 4; // Simulating dividing button click
        double result = calculator.oldValue / calculator.newValue;
        assertEquals(real_result, result, "multiplication should return " + real_result);
    }
}
