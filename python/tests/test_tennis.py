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
