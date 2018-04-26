package level1;

/**
 * Requirements:
 *
 * We have provided a class named BowlingGame which has two methods:
 * roll(pins : int) : void
 *      This is called each time the player rolls a ball. The argument is the number of pins knocked down.
 * score() : int
 *      This is called only at the very end of the game. It returns the total score for that game.
 *
 * Rules of Bowling:
 *
 * The game consists of 10 frames.  In each frame the player has two opportunities to knock down 10 pins.
 * The score for the frame is the total number of pins knocked down, plus bonuses for strikes and spares.
 *
 * A spare is when the player knocks down all 10 pins in two tries.  The bonus for that frame is the number of pins knocked down by the next roll.
 * So if in frame 2 a player rolls a spare, and in frame 3 they knock down 5 pins on the first roll, the score for frame 2 is 10 (the total
 * number knocked down in frame 2) plus a bonus of 5 (the number of pins knocked down on the next roll.)
 *
 * A strike is when the player knocks down all 10 pins on his first try.  The bonus for that frame is the value of the next two balls rolled.
 *
 * In the tenth frame a player who rolls a spare or strike is allowed to roll the extra balls to complete the frame.  However no more than three
 * balls can be rolled in tenth frame. For instance, if the player rolls a strike in the tenth frame, they will be allowed to roll two additional
 * balls and if they roll a spare, they will be allowed to roll one additional ball.
 *
 * For your convenience:
 * The minimum number of rolls is 11. That is, 9 strikes followed by 2 rolls not resulting in a spare (thus, no extra balls are allotted).
 * The maximum number of rolls is 21. That is, 9 frames with no strikes followed by 3 rolls in the 10th frame.
 */
public class BowlingGame {

    public void roll(int pins) {
    }

    public int score() {
        return 0;
    }
}
