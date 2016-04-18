from tennis.tennis_service import display_score


def should_display_regular_score():
    assert display_score(1, 0) == "fifteen-love"
    assert display_score(1, 2) == "fifteen-thirty"
    assert display_score(3, 2) == "forty-thirty"


def should_display_score_for_equality():
    assert display_score(0, 0) == "love-all"
    assert display_score(1, 1) == "fifteen-all"
    assert display_score(2, 2) == "thirty-all"
    assert display_score(3, 3) == "deuce"
    assert display_score(4, 4) == "deuce"


def should_display_score_for_advantage():
    assert display_score(3, 4) == "advantage player2"
    assert display_score(4, 3) == "advantage player1"
    assert display_score(5, 4) == "advantage player1"
    assert display_score(14, 15) == "advantage player2"


def should_display_score_for_the_end_of_the_game():
    assert display_score(6, 4) == "win for player1"
    assert display_score(4, 6) == "win for player2"
    assert display_score(16, 14) == "win for player1"
