from tennis.tennis_service import TennisService


def should_display_regular_score():
    tennis_service = TennisService()
    assert tennis_service.display_score(1, 0) == "fifteen-love"
    assert tennis_service.display_score(1, 2) == "fifteen-thirty"
    assert tennis_service.display_score(3, 2) == "forty-thirty"


def should_display_score_for_equality():
    tennis_service = TennisService()
    assert tennis_service.display_score(0, 0) == "love-all"
    assert tennis_service.display_score(1, 1) == "fifteen-all"
    assert tennis_service.display_score(2, 2) == "thirty-all"
    assert tennis_service.display_score(3, 3) == "deuce"
    assert tennis_service.display_score(4, 4) == "deuce"


def should_display_score_for_advantage():
    tennis_service = TennisService()
    assert tennis_service.display_score(3, 4) == "advantage player2"
    assert tennis_service.display_score(4, 3) == "advantage player1"
    assert tennis_service.display_score(5, 4) == "advantage player1"
    assert tennis_service.display_score(14, 15) == "advantage player2"


def should_display_score_for_the_end_of_the_game():
    tennis_service = TennisService()
    assert tennis_service.display_score(6, 4) == "win for player1"
    assert tennis_service.display_score(4, 6) == "win for player2"
    assert tennis_service.display_score(16, 14) == "win for player1"
