package tennis;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TennisTest {

    TennisService game = new TennisService();

    @Test
    public void should_display_regular_score() {
        assertThat(displayScore(1, 0)).isEqualTo("fifteen-love");
        assertThat(displayScore(1, 2)).isEqualTo("fifteen-thirty");
        assertThat(displayScore(3, 2)).isEqualTo("forty-thirty");
    }

    @Test
    public void should_display_score_for_equality() {
        assertThat(displayScore(0, 0)).isEqualTo("love-all");
        assertThat(displayScore(1, 1)).isEqualTo("fifteen-all");
        assertThat(displayScore(2, 2)).isEqualTo("thirty-all");
        assertThat(displayScore(3, 3)).isEqualTo("deuce");
        assertThat(displayScore(4, 4)).isEqualTo("deuce");
    }

    @Test
    public void should_display_score_for_advantage() {
        assertThat(displayScore(3, 4)).isEqualTo("advantage player2");
        assertThat(displayScore(4, 3)).isEqualTo("advantage player1");
        assertThat(displayScore(5, 4)).isEqualTo("advantage player1");
        assertThat(displayScore(14, 15)).isEqualTo("advantage player2");
    }

    @Test
    public void should_display_score_for_the_end_of_the_game() {
        assertThat(displayScore(6, 4)).isEqualTo("win for player1");
        assertThat(displayScore(4, 6)).isEqualTo("win for player2");
        assertThat(displayScore(16, 14)).isEqualTo("win for player1");
    }

    private String displayScore(int player1Score, int player2Score) {
        return game.displayScore("player1", player1Score, "player2", player2Score);
    }
}