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
            assertEquals(cal.add("2:5:7"), 14);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    void add_음수시에러() throws RuntimeException {
        assertThrows(RuntimeException.class, () -> {
            assertEquals(cal.add("-1,2,3"), 6);
        });
    }

    @Test
    void testAdd() {
    }
}