import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {

    @Test
    public void testNumberOfWaysToSumWithRepetitionFor1NumberThatCannotMeetSum() {
        int[] numbers = new int[] { 5 };
        int sum = 6;
        assertEquals(0, Sum.getNumberOfWaysToSumWithRepetition(numbers, sum));
    }

    @Test
    public void testNumberOfWaysToSumWithRepetitionForMoreThanOneNumberThatCannotMeetSum() {
        int[] numbers = new int[] { 4, 5 };
        int sum = 6;
        assertEquals(0, Sum.getNumberOfWaysToSumWithRepetition(numbers, sum));
    }

    @Test
    public void testNumberOfWaysToSumWithRepetitionForNumbersHigherThanSum() {
        int[] numbers = new int[] { 12 };
        int sum = 6;
        assertEquals(0, Sum.getNumberOfWaysToSumWithRepetition(numbers, sum));
    }

    @Test
    public void testNumberOfWaysToSumWithRepetitionFor1NumberThatEqualsSum() {
        int[] numbers = new int[] { 5 };
        int sum = 5;
        assertEquals(1, Sum.getNumberOfWaysToSumWithRepetition(numbers, sum));
    }

    @Test
    public void testNumberOfWaysToSumWithRepetitionFor1NumberThatCanMeetSumThroughRepetition() {
        int[] numbers = new int[] { 2 };
        int sum = 6;
        assertEquals(1, Sum.getNumberOfWaysToSumWithRepetition(numbers, sum));
    }

    @Test
    public void testNumberOfWaysToSumWithRepetitionForNumbersThatCanMeetSumOneWayWithoutRepetition() {
        int[] numbers = new int[] { 4, 5 };
        int sum = 9;
        assertEquals(1, Sum.getNumberOfWaysToSumWithRepetition(numbers, sum));
    }

    @Test
    public void testNumberOfWaysToSumWithRepetitionForNumbersThatCanMeetSumOneWayWithRepetition() {
        int[] numbers = new int[] { 2, 5 };
        int sum = 9;
        assertEquals(1, Sum.getNumberOfWaysToSumWithRepetition(numbers, sum));
    }

    @Test
    public void testNumberOfWaysToSumWithRepetitionForNumbersThatCanMeetSumMultipleWaysWithoutRepetition() {
        int[] numbers = new int[] { 3, 8, 9, 14 };
        int sum = 17;
        assertEquals(3, Sum.getNumberOfWaysToSumWithRepetition(numbers, sum));
    }

    @Test
    public void testNumberOfWaysToSumWithRepetitionForNumbersThatCanMeetSumMultipleWaysWithRepetition() {
        int[] numbers = new int[] { 5, 10 };
        int sum = 15;
        assertEquals(2, Sum.getNumberOfWaysToSumWithRepetition(numbers, sum));
    }

    @Test
    public void testNumberOfWaysToSumWithRepetitionForNumbersThatCanMeetSumWithSomeUnusable() {
        int[] numbers = new int[] { 2, 5, 9, 10, 16 };
        int sum = 19;
        assertEquals(6, Sum.getNumberOfWaysToSumWithRepetition(numbers, sum));
    }

    @Test
    public void testNumberOfWaysToSumWithRepetitionWhenNumbersIncludes1() {
        int[] numbers = new int[] { 1, 4, 6 };
        int sum = 10;
        assertEquals(5, Sum.getNumberOfWaysToSumWithRepetition(numbers, sum));
    }

    @Test
    public void testNumberOfWaysToSumWithRepetitionForNumbersAndSumInMethodDescription() {
        int[] numbers = new int[] { 5, 3, 9 };
        int sum = 17;
        assertEquals(2, Sum.getNumberOfWaysToSumWithRepetition(numbers, sum));
    }

    @Test
    public void testNumberOfWaysToSumWithRepetitionExtraTestCases() {
        int[] numbers = new int[] { 3, 9, 21, 4, 11, 16, 6 };
        int sum = 47;
        assertEquals(138, Sum.getNumberOfWaysToSumWithRepetition(numbers, sum));

        numbers = new int[] { 1, 5, 6 };
        sum = 7;
        assertEquals(3, Sum.getNumberOfWaysToSumWithRepetition(numbers, sum));

        numbers = new int[] { 12, 3, 1, 9 };
        sum = 14;
        assertEquals(8, Sum.getNumberOfWaysToSumWithRepetition(numbers, sum));
    }
}