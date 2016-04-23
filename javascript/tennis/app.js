var express = require('express');
var TennisService = require('./models/tennisService');
var app = express();

app.get('/', function (req, res) {
  res.send('Hello World!');
});

app.get('/displayScore', function (req, res) {
  res.send(new TennisService().displayScore(parseInt(req.query.player1Score), parseInt(req.query.player2Score)));
});

app.listen(8080, function () {
  console.log('Example app listening on port 8080!');
});