package level1;

import level1.BowlingGame;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class BowlingGameTest {

    private BowlingGame bowlingGame;

    @Before
    public void beforeEach() {
        bowlingGame = new BowlingGame();
    }

    @Test
    public void testGutterGame() {
        rollMany(20, 0);
        assertEquals(0, bowlingGame.score());
    }

    @Test
    public void testAllOnes() {
        rollMany(20, 1);
        assertEquals(20, bowlingGame.score());
    }

    @Test
    public void testOneSpare() {
        rollSpare();
        bowlingGame.roll(3);
        bowlingGame.roll(4);
        rollMany(16, 0);
        assertEquals(20, bowlingGame.score());
    }

    @Test
    public void testOneStrike() {
        rollStrike();
        bowlingGame.roll(3);
        bowlingGame.roll(4);
        rollMany(16, 0);
        assertEquals(24, bowlingGame.score());
    }

    @Test
    public void testMinimumRollGame() {
        rollMany(9, 10);
        rollMany(1, 2);
        assertEquals(246, bowlingGame.score());
    }

    @Test
    public void testMaximumRollGame() {
        rollMany(1, 18);
        rollMany(3, 10);
        assertEquals(58, bowlingGame.score());
    }

    @Test
    public void testPerfectGame() {
        rollMany(12, 10);
        assertEquals(300, bowlingGame.score());
    }

    private void rollMany(int numberOfRolls, int pins) {
        for (int i = 0; i < numberOfRolls; i++) {
            bowlingGame.roll(pins);
        }
    }

    private void rollSpare() {
        Random random = new Random();
        int firstRoll = random.nextInt(10);
        int secondRoll = 10 - firstRoll;
        bowlingGame.roll(firstRoll);
        bowlingGame.roll(secondRoll);
    }

    private void rollStrike() {
        bowlingGame.roll(10);
    }
}
