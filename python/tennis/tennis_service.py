def display_score(player1_score, player2_score):
    if player1_score == player2_score:
        return global_score_as_string_for_equality(player1_score)
    elif player1_score >= 4 or player2_score >= 4:
        return global_score_as_string_for_point_end()
    else:
        return single_player_score_as_string(player1_score) + "-" + single_player_score_as_string(player2_score)


def global_score_as_string_for_equality(player_score):
    switcher = {
        0: "love-all",
        1: "fifteen-all",
        2: "thirty-all",
    }
    return switcher.get(player_score, "deuce")


def global_score_as_string_for_point_end():
    pass


def single_player_score_as_string(player1_score):
    switcher = {
        0: "love",
        1: "fifteen",
        2: "thirty",
    }
    return switcher.get(player1_score, "forty")
