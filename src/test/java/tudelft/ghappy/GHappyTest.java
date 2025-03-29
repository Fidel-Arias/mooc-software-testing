package tudelft.ghappy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GHappyTest {
    @Test
    public void testNoG() {
        assertTrue(new GHappy().gHappy(""));
        assertTrue(new GHappy().gHappy("xxyyzz"));
    }

    @Test
    public void testSingleG() {
        assertFalse(new GHappy().gHappy("g"));
        assertFalse(new GHappy().gHappy("xxgxx"));
    }

    @Test
    public void testHappyG() {
        assertTrue(new GHappy().gHappy("gg"));
        assertTrue(new GHappy().gHappy("xxggxx"));
        assertTrue(new GHappy().gHappy("xxggyyggxx"));
    }

    @Test
    public void testUnhappyG() {
        assertFalse(new GHappy().gHappy("xxggyygxx"));
        assertFalse(new GHappy().gHappy("gxx"));
        assertFalse(new GHappy().gHappy("xxg"));
    }

    @Test
    public void testEdgeCases() {
        assertTrue(new GHappy().gHappy("ggg"));
        assertFalse(new GHappy().gHappy("gxxggyyg"));
    }
}
