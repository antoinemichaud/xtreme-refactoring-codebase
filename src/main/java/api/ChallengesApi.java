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
                        .get("/displayScore/:language", (context, language) ->
                                new TennisService()
                                        .displayScore(language, context.get("player1Name"),
                                                context.query().getInteger("player1Score"),
                                                context.get("player2Name"),
                                                context.query().getInteger("player2Score")
                                        )
                        )
        ).start(8080);
    }

}
