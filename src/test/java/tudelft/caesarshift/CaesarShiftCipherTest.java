package tudelft.caesarshift;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaesarShiftCipherTest {
    // Add test cases here
    @Test
    public void ValidMessageWithPositiveShift() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("def", cipher.CaesarShiftCipherMethod("abc", 3));
        assertEquals("abc", cipher.CaesarShiftCipherMethod("xyz", 3));
        assertEquals("khoor", cipher.CaesarShiftCipherMethod("hello", 3));
    }

    @Test
    public void ValidMessageWithNegativeShift() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("xyz", cipher.CaesarShiftCipherMethod("abc", -3));
        assertEquals("abc", cipher.CaesarShiftCipherMethod("def", -3));
        assertEquals("ebiil", cipher.CaesarShiftCipherMethod("hello", -3));
    }

    @Test
    public void testWithSpaces() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("d e f", cipher.CaesarShiftCipherMethod("a b c", 3));
        assertEquals("khoor zruog", cipher.CaesarShiftCipherMethod("hello world", 3));
    }

    @Test
    public void testInvalidCharacters() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("invalid", cipher.CaesarShiftCipherMethod("abc123", 3));
        assertEquals("invalid", cipher.CaesarShiftCipherMethod("ABC", 3));
        assertEquals("invalid", cipher.CaesarShiftCipherMethod("a.b", 3));
    }

    @Test
    public void testLargeShift() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("abc", cipher.CaesarShiftCipherMethod("abc", 26));  // Debe seguir igual
        assertEquals("nop", cipher.CaesarShiftCipherMethod("abc", 13));
    }
}
