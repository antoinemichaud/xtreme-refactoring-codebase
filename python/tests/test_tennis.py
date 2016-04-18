from tennis.tennis_service import display_score


def should_display_regular_score():
    assert display_score(1, 0) == "fifteen-love"
    assert display_score(1, 2) == "fifteen-thirty"
    assert display_score(3, 2) == "forty-thirty"
