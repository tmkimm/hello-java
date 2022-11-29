package nextStep;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    StringCalculator cal;
    @BeforeEach
    void before() {
        cal = new StringCalculator();
    }

    @Test
    void add() {
        try {
            assertEquals(cal.add("1,2,3"), 6);
            assertEquals(cal.add("1:2:3"), 6);
            assertEquals(cal.add("\\;\n1;2;3"), 6);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}