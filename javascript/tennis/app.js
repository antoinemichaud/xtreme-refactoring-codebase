var express = require('express');
var tennisService = require('./models/tennisService');
var app = express();

app.get('/', function (req, res) {
  res.send('Hello World!');
});

app.get('/displayScore', function (req, res) {
  res.send(tennisService.displayScore(parseInt(req.query.player1Score), parseInt(req.query.player2Score)));
});

app.listen(3000, function () {
  console.log('Example app listening on port 3000!');
});