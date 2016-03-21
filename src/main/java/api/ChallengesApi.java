package api;

import net.codestory.http.WebServer;
import tennis.TennisService;

public class ChallengesApi {

    public static void main(String[] args) {
        new WebServer().configure(
                routes -> routes
                        .get("/displayScore", (context) -> new TennisService()
                                .displayScore(context.get("player1Name"),
                                        context.query().getInteger("player1Score"),
                                        context.get("player2Name"),
                                        context.query().getInteger("player2Score")))
                        .get("/displayScore/alternative", (context) -> new TennisService()
                                .displayAlternativeScore(context.get("player1Name"),
                                        context.query().getInteger("player1Score"),
                                        context.get("player2Name"),
                                        context.query().getInteger("player2Score")))
                        .get("/displayScore/french", (context) -> new TennisService()
                                .displayFrenchScore(context.get("player1Name"),
                                        context.query().getInteger("player1Score"),
                                        context.get("player2Name"),
                                        context.query().getInteger("player2Score")))
                        .get("/displayScore/german", (context) -> new TennisService()
                                .displayGermanScore(context.get("player1Name"),
                                        context.query().getInteger("player1Score"),
                                        context.get("player2Name"),
                                        context.query().getInteger("player2Score")))
        ).start(8080);
    }

}
