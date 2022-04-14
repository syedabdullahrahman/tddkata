import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    void singleValue() {
        assertEquals(calculator.add("1"),1);
    }

    @Test
    void twoNumbersCommaDelimitersReturnSum() {
        assertEquals(calculator.add("1,2"),3);
    }

    @Test
    void twoNumbersNewLineDelimitersReturnSum() {
        assertEquals(calculator.add("1\n,2"),3);
    }

    @Test
    void threeNumbersCommaDelimitersDelimitersReturnSum() {
        assertEquals(calculator.add("1,2,3"),6);
    }

    @Test
    void negativeNumbersReturnException() {
        assertThrows(Exception.class,()->{
            calculator.add("-1");
        });
    }
}