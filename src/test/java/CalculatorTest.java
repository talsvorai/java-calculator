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
    String num_a_text = Double.toString(num_a);
    String num_b_text = Double.toString(num_b);



    @Test
    void testAddition() {
        // Set up the initial value
        calculator.oldValue = num_a;
        calculator.DisplayLabel.setText(num_a_text);  // Simulate entering the first number

        calculator.calculation = 1;  // Simulate pressing the "+" button
        calculator.DisplayLabel.setText(num_b_text);  // Simulate entering the second number
        double additionResult = calculator.oldValue + Double.parseDouble(calculator.DisplayLabel.getText());
        calculator.equelbutton.doClick();  // Simulate pressing the "=" button
        assertEquals(additionResult, Double.parseDouble(calculator.DisplayLabel.getText()), "Addition failed!");
    }

    @Test
    void testSubtraction() {
        // Set up the initial value
        calculator.oldValue = num_a;
        calculator.DisplayLabel.setText(num_a_text);  // Simulate entering the first number

        // Test Subtraction
        calculator.calculation = 2;  // Simulate pressing the "-" button
        calculator.DisplayLabel.setText(num_b_text);  // Simulate entering the second number
        double subtractionResult = calculator.oldValue - Double.parseDouble(calculator.DisplayLabel.getText());
        calculator.equelbutton.doClick();  // Simulate pressing the "=" button
        assertEquals(subtractionResult, Double.parseDouble(calculator.DisplayLabel.getText()), "Subtraction failed!");
    }

    @Test
    void testMultiplication() {
        // Set up the initial value
        calculator.oldValue = num_a;
        calculator.DisplayLabel.setText(num_a_text);  // Simulate entering the first number

        calculator.calculation = 3;  // Simulate pressing the "* button
        calculator.DisplayLabel.setText(num_b_text);  // Simulate entering the second number
        double multiplicationResult = calculator.oldValue * Double.parseDouble(calculator.DisplayLabel.getText());
        calculator.equelbutton.doClick();  // Simulate pressing the "=" button
        assertEquals(multiplicationResult, Double.parseDouble(calculator.DisplayLabel.getText()), "Multiplication failed!");
    }

    @Test
    void testDivision() {
        // Set up the initial value
        calculator.oldValue = num_a;
        calculator.DisplayLabel.setText(num_a_text);  // Simulate entering the first number

        calculator.calculation = 4;  // Simulate pressing the "/" button
        calculator.DisplayLabel.setText(num_b_text);  // Simulate entering the second number
        double divisionResult = calculator.oldValue / Double.parseDouble(calculator.DisplayLabel.getText());
        calculator.equelbutton.doClick();  // Simulate pressing the "=" button
        assertEquals(divisionResult, Double.parseDouble(calculator.DisplayLabel.getText()), "Division failed!");
        
    }
}