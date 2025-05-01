package tudelft.sum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoNumbersSumTest {
    @Test
    public void testSimpleSum() {
        TwoNumbersSum calculator = new TwoNumbersSum();
        ArrayList<Integer> result = calculator.addTwoNumbers(
                new ArrayList<>(Arrays.asList(1, 2)),
                new ArrayList<>(Arrays.asList(3, 4))
        );
        assertEquals(Arrays.asList(4, 6), result);
    }

    @Test
    public void testWithCarryOver() {
        TwoNumbersSum calculator = new TwoNumbersSum();
        ArrayList<Integer> result = calculator.addTwoNumbers(
                new ArrayList<>(Arrays.asList(9, 9)),
                new ArrayList<>(Arrays.asList(1))
        );
        assertEquals(Arrays.asList(1, 0, 0), result);
    }

    @Test
    public void testDifferentLengths() {
        TwoNumbersSum calculator = new TwoNumbersSum();
        ArrayList<Integer> result = calculator.addTwoNumbers(
                new ArrayList<>(Arrays.asList(1, 2, 3)),
                new ArrayList<>(Arrays.asList(9, 9))
        );
        assertEquals(Arrays.asList(2, 2, 2), result);
    }

    @Test
    public void testAddZero() {
        TwoNumbersSum calculator = new TwoNumbersSum();
        ArrayList<Integer> result = calculator.addTwoNumbers(
                new ArrayList<>(Arrays.asList(0)),
                new ArrayList<>(Arrays.asList(0))
        );
        assertEquals(Arrays.asList(0), result);
    }

    @Test
    public void testSumResultingInNewDigit() {
        TwoNumbersSum calculator = new TwoNumbersSum();
        ArrayList<Integer> result = calculator.addTwoNumbers(
                new ArrayList<>(Arrays.asList(5)),
                new ArrayList<>(Arrays.asList(5))
        );
        assertEquals(Arrays.asList(1, 0), result);
    }
}
