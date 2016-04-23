package tennis;

public class TennisService {

    public int P1point = 0;
    public int P2point = 0;

    public String P1res = "";
    public String P2res = "";
    private String player1Name;
    private String player2Name;

    public TennisService() {
    }

    private TennisService(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String displayScore(String player1Name, int player1Score, String player2Name, int player2Score) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
        this.P1point = 0;
        this.P2point = 0;
        SetP1Score(player1Score);
        SetP2Score(player2Score);
        return getScore();
    }

    public String getScore(){
        String score = "";
        if (P1point == P2point && P1point < 4)
        {
            if (P1point==0)
                score = "love";
            if (P1point==1)
                score = "fifteen";
            if (P1point==2)
                score = "thirty";
            score += "-all";
        }
        if (P1point==P2point && P1point>=3)
            score = "deuce";

        if (P1point > 0 && P2point==0)
        {
            if (P1point==1)
                P1res = "fifteen";
            if (P1point==2)
                P1res = "thirty";
            if (P1point==3)
                P1res = "forty";

            P2res = "love";
            score = P1res + "-" + P2res;
        }
        if (P2point > 0 && P1point==0)
        {
            if (P2point==1)
                P2res = "fifteen";
            if (P2point==2)
                P2res = "thirty";
            if (P2point==3)
                P2res = "forty";

            P1res = "love";
            score = P1res + "-" + P2res;
        }

        if (P1point>P2point && P1point < 4)
        {
            if (P1point==2)
                P1res="thirty";
            if (P1point==3)
                P1res="forty";
            if (P2point==1)
                P2res="fifteen";
            if (P2point==2)
                P2res="thirty";
            score = P1res + "-" + P2res;
        }
        if (P2point>P1point && P2point < 4)
        {
            if (P2point==2)
                P2res="thirty";
            if (P2point==3)
                P2res="forty";
            if (P1point==1)
                P1res="fifteen";
            if (P1point==2)
                P1res="thirty";
            score = P1res + "-" + P2res;
        }

        if (P1point > P2point && P2point >= 3)
        {
            score = "advantage player1";
        }

        if (P2point > P1point && P1point >= 3)
        {
            score = "advantage player2";
        }

        if (P1point>=4 && P2point>=0 && (P1point-P2point)>=2)
        {
            score = "win for player1";
        }
        if (P2point>=4 && P1point>=0 && (P2point-P1point)>=2)
        {
            score = "win for player2";
        }
        return score;
    }

    public void SetP1Score(int number){

        for (int i = 0; i < number; i++)
        {
            P1Score();
        }

    }

    public void SetP2Score(int number){

        for (int i = 0; i < number; i++)
        {
            P2Score();
        }

    }

    public void P1Score(){
        P1point++;
    }

    public void P2Score(){
        P2point++;
    }

    public void wonPoint(String player) {
        if (player == "player1")
            P1Score();
        else
            P2Score();
    }

    public String displayScore(String language, String player1Name, int player1Score, String player2Name, int player2Score) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
        this.P1point = 0;
        this.P2point = 0;
        SetP1Score(player1Score);
        SetP2Score(player2Score);
        return getFrenchScore();
    }

    public String getFrenchScore(){
        String score = "";
        if (P1point == P2point && P1point < 4)
        {
            if (P1point==0)
                score = "zéro";
            if (P1point==1)
                score = "quinze";
            if (P1point==2)
                score = "trente";
            score += "-partout";
        }
        if (P1point==P2point && P1point>=3)
            score = "égalité";

        if (P1point > 0 && P2point==0)
        {
            if (P1point==1)
                P1res = "quinze";
            if (P1point==2)
                P1res = "trente";
            if (P1point==3)
                P1res = "quarante";

            P2res = "zéro";
            score = P1res + "-" + P2res;
        }
        if (P2point > 0 && P1point==0)
        {
            if (P2point==1)
                P2res = "quinze";
            if (P2point==2)
                P2res = "trente";
            if (P2point==3)
                P2res = "quarante";

            P1res = "zéro";
            score = P1res + "-" + P2res;
        }

        if (P1point>P2point && P1point < 4)
        {
            if (P1point==2)
                P1res="trente";
            if (P1point==3)
                P1res="quarante";
            if (P2point==1)
                P2res="quinze";
            if (P2point==2)
                P2res="trente";
            score = P1res + "-" + P2res;
        }
        if (P2point>P1point && P2point < 4)
        {
            if (P2point==2)
                P2res="trente";
            if (P2point==3)
                P2res="quarante";
            if (P1point==1)
                P1res="quinze";
            if (P1point==2)
                P1res="trente";
            score = P1res + "-" + P2res;
        }

        if (P1point > P2point && P2point >= 3)
        {
            score = "avantage player1";
        }

        if (P2point > P1point && P1point >= 3)
        {
            score = "avantage player2";
        }

        if (P1point>=4 && P2point>=0 && (P1point-P2point)>=2)
        {
            score = "jeu pour player1";
        }
        if (P2point>=4 && P1point>=0 && (P2point-P1point)>=2)
        {
            score = "jeu pour player2";
        }
        return score;
    }
}
