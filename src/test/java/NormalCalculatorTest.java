import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * User: Syed Abdullah
 * Date: 15-Apr-2022
 * Time: 12:27 AM
 */
class NormalCalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new NormalCalculator();
    }

    @Test
    void emptyStringReturnZero() {
        assertEquals(calculator.add(""),0);
    }
}