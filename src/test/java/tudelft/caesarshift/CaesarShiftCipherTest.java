package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaesarShiftCipherTest {
    // Add test cases here
    @Test
    public void ValidMessageWithPositiveShift() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("def", cipher.CaesarShiftCipher("abc", 3));
        assertEquals("abc", cipher.CaesarShiftCipher("xyz", 3));
        assertEquals("khoor", cipher.CaesarShiftCipher("hello", 3));
    }

    @Test
    public void ValidMessageWithNegativeShift() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("xyz", cipher.CaesarShiftCipher("abc", -3));
        assertEquals("abc", cipher.CaesarShiftCipher("def", -3));
        assertEquals("ebiil", cipher.CaesarShiftCipher("hello", -3));
    }

    @Test
    public void testWithSpaces() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("d e f", cipher.CaesarShiftCipher("a b c", 3));
        assertEquals("khoor zruog", cipher.CaesarShiftCipher("hello world", 3));
    }

    @Test
    public void testInvalidCharacters() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("invalid", cipher.CaesarShiftCipher("abc123", 3));
        assertEquals("invalid", cipher.CaesarShiftCipher("ABC", 3));
        assertEquals("invalid", cipher.CaesarShiftCipher("a.b", 3));
    }

    @Test
    public void testLargeShift() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("abc", cipher.CaesarShiftCipher("abc", 26));  // Debe seguir igual
        assertEquals("nop", cipher.CaesarShiftCipher("abc", 13));
    }
}
