package tudelft.mirror;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MirrorTest {

    @Test
    public void testMirrorEnds1() {
        Mirror m = new Mirror();
        assertEquals("ab", m.mirrorEnds("abXYZba"));
    }

    @Test
    public void testMirrorEnds2() {
        Mirror m = new Mirror();
        assertEquals("a", m.mirrorEnds("abca"));
    }

    @Test
    public void testMirrorEnds3() {
        Mirror m = new Mirror();
        assertEquals("aba", m.mirrorEnds("aba"));
    }

    @Test
    public void testMirrorEndsEmpty() {
        Mirror m = new Mirror();
        assertEquals("", m.mirrorEnds(""));
    }

    @Test
    public void testMirrorEndsNoMatch() {
        Mirror m = new Mirror();
        assertEquals("", m.mirrorEnds("xyz"));
    }
}

