var TennisService = function (player1Name, player2Name) {
  this.P1point = 0;
  this.P2point = 0;

  this.P1res = "";
  this.P2res = "";

  this.player1Name = player1Name;
  this.player2Name = player2Name;
};

TennisService.prototype.displayScore = function (p1S, p2S) {
  this.P1point = p1S;
  this.P2point = p2S;
  return this.getScore();
};

TennisService.prototype.getScore = function () {
  var score = "";

  if (this.P1point === this.P2point && this.P1point < 3) {
    if (this.P1point === 0)
      score = "love";
    if (this.P1point === 1)
      score = "fifteen";
    if (this.P1point === 2)
      score = "thirty";
    score += "-all";
  }
  if (this.P1point === this.P2point && this.P1point > 2)
    score = "deuce";

  if (this.P1point > 0 && this.P2point === 0) {
    if (this.P1point === 1)
      this.P1res = "fifteen";
    if (this.P1point === 2)
      this.P1res = "thirty";
    if (this.P1point === 3)
      this.P1res = "forty";

    this.P2res = "love";
    score = this.P1res + "-" + this.P2res;
  }
  if (this.P2point > 0 && this.P1point === 0) {
    if (this.P2point === 1)
      this.P2res = "fifteen";
    if (this.P2point === 2)
      this.P2res = "thirty";
    if (this.P2point === 3)
      this.P2res = "forty";

    this.P1res = "love";
    score = this.P1res + "-" + this.P2res;
  }

  if (this.P1point > this.P2point && this.P1point < 4) {
    if (this.P1point === 2)
      this.P1res = "thirty";
    if (this.P1point === 3)
      this.P1res = "forty";
    if (this.P2point === 1)
      this.P2res = "fifteen";
    if (this.P2point === 2)
      this.P2res = "thirty";
    score = this.P1res + "-" + this.P2res;
  }
  if (this.P2point > this.P1point && this.P2point < 4) {
    if (this.P2point === 2)
      this.P2res = "thirty";
    if (this.P2point === 3)
      this.P2res = "forty";
    if (this.P1point === 1)
      this.P1res = "fifteen";
    if (this.P1point === 2)
    this.P1res = "thirty";
    score = this.P1res + "-" + this.P2res;
  }

  if (this.P1point > this.P2point && this.P2point >= 3) {
    score = "advantage player1";
  }

  if (this.P2point > this.P1point && this.P1point >= 3) {
    score = "advantage player2";
  }

  if (this.P1point >= 4 && this.P2point >= 0 && (this.P1point - this.P2point) >= 2) {
    score = "win for player1";
  }
  if (this.P2point >= 4 && this.P1point >= 0 && (this.P2point - this.P1point) >= 2) {
    score = "win for player2";
  }
  return score;
};

TennisService.prototype.SetP1Score = function (number) {
  var i;
  for (i = 0; i < number; i++) {
    this.P1Score();
  }
};

TennisService.prototype.SetP2Score = function (number) {
  var i;
  for (i = 0; i < number; i++) {
    this.P2Score();
  }
};

TennisService.prototype.P1Score = function () {
  this.P1point++;
};

TennisService.prototype.P2Score = function () {
  this.P2point++;
};

TennisService.prototype.wonPoint = function (player) {
  if (player === "player1")
    this.P1Score();
  else
    this.P2Score();
};

module.exports = TennisService;