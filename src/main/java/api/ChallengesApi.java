package api;

import com.google.common.base.Splitter;
import net.codestory.http.WebServer;
import tennis.TennisService;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class ChallengesApi {

    public static void main(String[] args) {

        new WebServer().configure(
                routes -> routes
                        .get("/displayScore", (context) -> new TennisService()
                                .displayScore(context.get("player1Name"),
                                        context.query().getInteger("player1Score"),
                                        context.get("player2Name"),
                                        context.query().getInteger("player2Score")))
                        .get("/displayAlternativeScore", (context) -> new TennisService()
                                .displayAlternativeScore(context.get("player1Name"),
                                        context.query().getInteger("player1Score"),
                                        context.get("player2Name"),
                                        context.query().getInteger("player2Score")))
                        .get("/displayFrenchScore", (context) -> new TennisService()
                                .displayFrenchScore(context.get("player1Name"),
                                        context.query().getInteger("player1Score"),
                                        context.get("player2Name"),
                                        context.query().getInteger("player2Score")))
                        .get("/displayGermanScore", (context) -> new TennisService()
                                .displayGermanScore(context.get("player1Name"),
                                        context.query().getInteger("player1Score"),
                                        context.get("player2Name"),
                                        context.query().getInteger("player2Score")))
                        .get("/sets/displaySetScore", (context) -> {
                            List<Integer> scores = Splitter.on(",").splitToList(context.get("scores")).stream().map(Integer::parseInt).collect(toList());
                            return new TennisService().displaySetScore(scores);
                        })

        ).start(8080);
    }

}
