package api;

import net.codestory.http.WebServer;
import tennis.TennisService;

public class ChallengesApi {

    public static void main(String[] args) {
        TennisService tennisService = new TennisService();

        new WebServer().configure(
                routes -> routes
                        .get("/displayScore", (context) -> tennisService
                                .displayScore(context.get("player1Name"),
                                        context.query().getInteger("player1Score"),
                                        context.get("player2Name"),
                                        context.query().getInteger("player2Score")))
                        .get("/displayScore/alternative", (context) -> tennisService
                                .displayAlternativeScore(context.get("player1Name"),
                                        context.query().getInteger("player1Score"),
                                        context.get("player2Name"),
                                        context.query().getInteger("player2Score")))
                        .get("/displayScore/french", (context) -> tennisService
                                .displayFrenchScore(context.get("player1Name"),
                                        context.query().getInteger("player1Score"),
                                        context.get("player2Name"),
                                        context.query().getInteger("player2Score")))
                        .get("/displayScore/german", (context) -> tennisService
                                .displayGermanScore(context.get("player1Name"),
                                        context.query().getInteger("player1Score"),
                                        context.get("player2Name"),
                                        context.query().getInteger("player2Score")))
        ).start(8080);
    }

}
