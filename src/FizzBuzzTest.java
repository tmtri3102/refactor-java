import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    private void assertFizzBuzz(int number, String expected) {
        assertEquals(expected, FizzBuzz.fizzBuzz(number));
    }

    @Test
    void testFizzNumbers() {
        assertFizzBuzz(3, "Fizz");
        assertFizzBuzz(6, "Fizz");
    }

    @Test
    void testBuzzNumbers() {
        assertFizzBuzz(5, "Buzz");
        assertFizzBuzz(10, "Buzz");
    }

    @Test
    void testFizzBuzzNumbers() {
        assertFizzBuzz(15, "FizzBuzz");
        assertFizzBuzz(30, "FizzBuzz");
    }

    @Test
    void testNonFizzBuzzNumbers() {
        assertFizzBuzz(1, "1");
        assertFizzBuzz(7, "7");
    }
}
