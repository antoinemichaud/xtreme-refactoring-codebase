package tennis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TennisTest {

    private int player1Score;
    private int player2Score;
    private String expectedScore;

    public TennisTest(int player1Score, int player2Score, String expectedScore) {
        this.player1Score = player1Score;
        this.player2Score = player2Score;
        this.expectedScore = expectedScore;
    }

    @Parameters
    public static Collection<Object[]> getallScores() {
        return Arrays.asList(new Object[][] {
                { 0, 0, "love-all" },
                { 1, 1, "fifteen-all" },
                { 2, 2, "thirty-all"},
                { 3, 3, "deuce"},
                { 4, 4, "deuce"},

                { 1, 0, "fifteen-love"},
                { 0, 1, "love-fifteen"},
                { 2, 0, "thirty-love"},
                { 0, 2, "love-thirty"},
                { 3, 0, "forty-love"},
                { 0, 3, "love-forty"},
                { 4, 0, "win for player1"},
                { 0, 4, "win for player2"},

                { 2, 1, "thirty-fifteen"},
                { 1, 2, "fifteen-thirty"},
                { 3, 1, "forty-fifteen"},
                { 1, 3, "fifteen-forty"},
                { 4, 1, "win for player1"},
                { 1, 4, "win for player2"},

                { 3, 2, "forty-thirty"},
                { 2, 3, "thirty-forty"},
                { 4, 2, "win for player1"},
                { 2, 4, "win for player2"},

                { 4, 3, "advantage player1"},
                { 3, 4, "advantage player2"},
                { 5, 4, "advantage player1"},
                { 4, 5, "advantage player2"},
                { 15, 14, "advantage player1"},
                { 14, 15, "advantage player2"},

                { 6, 4, "win for player1"},
                { 4, 6, "win for player2"},
                { 16, 14, "win for player1"},
                { 14, 16, "win for player2"},
        });
    }

    public void checkAllScores(TennisService game) {
        assertEquals(this.expectedScore, game.displayScore("player1", this.player1Score, "player2", this.player2Score));
    }

    @Test
    public void checkAllScoresTennisGame1() {
        TennisService game = new TennisService();
        checkAllScores(game);
    }
}