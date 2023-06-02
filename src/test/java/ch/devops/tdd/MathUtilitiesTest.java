package ch.devops.tdd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class MathUtilitiesTest {

    @Test
    void testNegativeIndex() {
        assertThrows(IllegalArgumentException.class, () -> MathUtilities.fibonacci(-1));
    }

    @Test
    void testZeroIndex() {
        assertEquals(0, MathUtilities.fibonacci(0));
    }

    @Test
    void testFirstIndex() {
        assertEquals(1, MathUtilities.fibonacci(1));
    }

    @Test
    void testSecondIndex() {
        assertEquals(1, MathUtilities.fibonacci(2));
    }

    @Test
    void testThirdIndex() {
        assertEquals(2, MathUtilities.fibonacci(3));
    }

    @Test
    void testFourthIndex() {
        assertEquals(3, MathUtilities.fibonacci(4));
    }

    @Test
    void testFifthIndex() {
        assertEquals(5, MathUtilities.fibonacci(5));
    }

    @Test
    void testSixthIndex() {
        assertEquals(8, MathUtilities.fibonacci(6));
    }

    @Test
    void testTenthIndex() {
        assertEquals(55, MathUtilities.fibonacci(10));
    }

    @Test
    void testLargeIndex() {
        assertEquals(2178309, MathUtilities.fibonacci(32));
    }
}
