package ch.devops.tdd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StringUtilitiesTest {

    @Test
    void testNullString() {
        assertThrows(IllegalArgumentException.class, () -> StringUtilities.isPalindrome(null));
    }

    @Test
    void testEmptyString() {
        assertTrue(StringUtilities.isPalindrome(""));
    }

    @Test
    void testSingleCharacterString() {
        assertTrue(StringUtilities.isPalindrome("a"));
    }

    @Test
    void testTwoCharacterPalindrome() {
        assertTrue(StringUtilities.isPalindrome("aa"));
    }

    @Test
    void testTwoCharacterNonPalindrome() {
        assertFalse(StringUtilities.isPalindrome("ab"));
    }

    @Test
    void testThreeCharacterPalindrome() {
        assertTrue(StringUtilities.isPalindrome("aba"));
    }

    @Test
    void testThreeCharacterNonPalindrome() {
        assertFalse(StringUtilities.isPalindrome("abc"));
    }

    @Test
    void testLongerPalindrome() {
        assertTrue(StringUtilities.isPalindrome("racecar"));
    }

    @Test
    void testLongerNonPalindrome() {
        assertFalse(StringUtilities.isPalindrome("hello"));
    }

    @Test
    void testPalindromeWithSpaces() {
        assertFalse(StringUtilities.isPalindrome("a man a plan a canal panama"));
    }
}
