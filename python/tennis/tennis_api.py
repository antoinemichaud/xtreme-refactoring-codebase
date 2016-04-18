from flask import Flask
from flask import request
import tennis.tennis_service

app = Flask(__name__)


@app.route('/')
def hello_world():
    return 'Hello World!'


@app.route('/displayScore')
def display_score():
    return tennis.tennis_service.display_score(int(request.args.get("player1Score")), int(request.args.get("player2Score")))


if __name__ == '__main__':
    app.run(host='0.0.0.0')
