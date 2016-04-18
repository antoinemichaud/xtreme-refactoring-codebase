function singlePlayerScoreAsString(playerScore) {
  switch (playerScore) {
    case 0:
      return "love";
    case 1:
      return "fifteen";
    case 2:
      return "thirty";
    default:
      return "forty";
  }
}

function globalScoreAsStringForEquality(player1Score) {
  switch (player1Score) {
    case 0:
      return "love-all";
    case 1:
      return "fifteen-all";
    case 2:
      return "thirty-all";
    default:
      return "deuce";
  }
}

function globalScoreAsStringForPointEnd(player1Score, player2Score) {
  var scoreDiff = player1Score - player2Score;
  if (scoreDiff == 1) return "advantage player1";
  else if (scoreDiff == -1) return "advantage player2";
  else if (scoreDiff >= 2) return "win for player1";
  else return "win for player2";
}

module.exports = {
  displayScore: function(player1Score, player2Score) {
    if (player1Score == player2Score) {
      return globalScoreAsStringForEquality(player1Score);
    } else if (player1Score >= 4 || player2Score >= 4) {
      return globalScoreAsStringForPointEnd(player1Score, player2Score);
    } else {
      return singlePlayerScoreAsString(player1Score) + "-" + singlePlayerScoreAsString(player2Score);
    }
  }
};
