from flask import Flask
from flask import request
import tennis.tennis_service

app = Flask(__name__)


@app.route('/')
def hello_world():
    return 'Hello World!'


@app.route('/displayScore')
def display_score():
    return tennis.tennis_service.TennisService().display_score(int(request.args.get("player1Score")),
                                                               int(request.args.get("player2Score")))


@app.route('/displayScore/<language>')
def display_score_with_lang(language):
    return tennis.tennis_service.TennisService().display_score_with_lang(language, int(request.args.get("player1Score")),
                                                               int(request.args.get("player2Score")))


if __name__ == '__main__':
    app.run(host='0.0.0.0', port=8080)
