package tennis;

public class TennisFrenchDisplayer {

    private String player1Name;
    private String player2Name;
    private int player1Score;
    private int player2Score;

    public void wonPoint(String playerName) {
        if (playerName.equals("player1"))
            player1Score += 1;
        else
            player2Score += 1;
    }

    private String globalScoreAsStringForEquality() {
        switch (player1Score) {
            case 0:
                return "Zéro partout";
            case 1:
                return "Quinze partout";
            case 2:
                return "Trente partout";
            default:
                return "Egalité";
        }
    }

    public String displayScore(String player1Name, int player1Score, String player2Name, int player2Score) {
        this.player1Score = player1Score;
        this.player2Score = player2Score;
        if (player1Score == player2Score) {
            return globalScoreAsStringForEquality();
        } else if (player1Score >= 4 || player2Score >= 4) {
            return globalScoreAsStringForPointEnd();
        } else {
            return singlePlayerScoreAsString(player1Score) + "-" + singlePlayerScoreAsString(player2Score);
        }
    }

    private String globalScoreAsStringForPointEnd() {
        int scoreDiff = player1Score - player2Score;
        if (scoreDiff == 1) return "Avantage player1";
        else if (scoreDiff == -1) return "Avantage player2";
        else if (scoreDiff >= 2) return "Jeu player1";
        else return "Jeu player2";
    }

    private String singlePlayerScoreAsString(int playerScore) {
        switch (playerScore) {
            case 0:
                return "Zéro";
            case 1:
                return "Quinze";
            case 2:
                return "Trente";
            default:
                return "Quarante";
        }
    }

}
