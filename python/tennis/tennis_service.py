class TennisService:
    def __init__(self):
        self.p1points = 0
        self.p2points = 0
        self.player1Name = 'player1'
        self.player2Name = 'player2'

    def display_score(self, p1score, p2Score):
        self.p1points = p1score
        self.p2points = p2Score
        return self.score()

    def won_point(self, player_name):
        if player_name == self.player1Name:
            self.P1Score()
        else:
            self.P2Score()

    def score(self):
        result = ""
        if (self.p1points == self.p2points and self.p1points < 3):
            if (self.p1points==0):
                result = "love"
            if (self.p1points==1):
                result = "fifteen"
            if (self.p1points==2):
                result = "thirty"
            result += "-all"
        if (self.p1points==self.p2points and self.p1points>2):
            result = "deuce"

        P1res = ""
        P2res = ""
        if (self.p1points > 0 and self.p2points==0):
            if (self.p1points==1):
                P1res = "fifteen"
            if (self.p1points==2):
                P1res = "thirty"
            if (self.p1points==3):
                P1res = "forty"

            P2res = "love"
            result = P1res + "-" + P2res
        if (self.p2points > 0 and self.p1points==0):
            if (self.p2points==1):
                P2res = "fifteen"
            if (self.p2points==2):
                P2res = "thirty"
            if (self.p2points==3):
                P2res = "forty"

            P1res = "love"
            result = P1res + "-" + P2res


        if (self.p1points>self.p2points and self.p1points < 4):
            if (self.p1points==2):
                P1res="thirty"
            if (self.p1points==3):
                P1res="forty"
            if (self.p2points==1):
                P2res="fifteen"
            if (self.p2points==2):
                P2res="thirty"
            result = P1res + "-" + P2res
        if (self.p2points>self.p1points and self.p2points < 4):
            if (self.p2points==2):
                P2res="thirty"
            if (self.p2points==3):
                P2res="forty"
            if (self.p1points==1):
                P1res="fifteen"
            if (self.p1points==2):
                P1res="thirty"
            result = P1res + "-" + P2res

        if (self.p1points > self.p2points and self.p2points >= 3):
            result = "advantage " + self.player1Name

        if (self.p2points > self.p1points and self.p1points >= 3):
            result = "advantage " + self.player2Name

        if (self.p1points>=4 and self.p2points>=0 and (self.p1points-self.p2points)>=2):
            result = "win for " + self.player1Name
        if (self.p2points>=4 and self.p1points>=0 and (self.p2points-self.p1points)>=2):
            result = "win for " + self.player2Name
        return result

    def SetP1Score(self, number):
        for i in range(number):
            self.P1Score()

    def SetP2Score(self, number):
        for i in range(number):
            self.P2Score()

    def P1Score(self):
        self.p1points +=1


    def P2Score(self):
        self.p2points +=1


    def display_score_with_lang(self, language, p1score, p2Score):
        self.p1points = p1score
        self.p2points = p2Score
        return self.french_score()


    def french_score(self):
        result = ""
        if (self.p1points == self.p2points and self.p1points < 3):
            if (self.p1points==0):
                result = "zéro"
            if (self.p1points==1):
                result = "quinze"
            if (self.p1points==2):
                result = "trente"
            result += "-partout"
        if (self.p1points==self.p2points and self.p1points>2):
            result = "égalité"

        P1res = ""
        P2res = ""
        if (self.p1points > 0 and self.p2points==0):
            if (self.p1points==1):
                P1res = "quinze"
            if (self.p1points==2):
                P1res = "trente"
            if (self.p1points==3):
                P1res = "quarante"

            P2res = "zéro"
            result = P1res + "-" + P2res
        if (self.p2points > 0 and self.p1points==0):
            if (self.p2points==1):
                P2res = "quinze"
            if (self.p2points==2):
                P2res = "trente"
            if (self.p2points==3):
                P2res = "quarante"

            P1res = "zéro"
            result = P1res + "-" + P2res


        if (self.p1points>self.p2points and self.p1points < 4):
            if (self.p1points==2):
                P1res="trente"
            if (self.p1points==3):
                P1res="quarante"
            if (self.p2points==1):
                P2res="quinze"
            if (self.p2points==2):
                P2res="trente"
            result = P1res + "-" + P2res
        if (self.p2points>self.p1points and self.p2points < 4):
            if (self.p2points==2):
                P2res="trente"
            if (self.p2points==3):
                P2res="quarante"
            if (self.p1points==1):
                P1res="quinze"
            if (self.p1points==2):
                P1res="trente"
            result = P1res + "-" + P2res

        if (self.p1points > self.p2points and self.p2points >= 3):
            result = "avantage " + self.player1Name

        if (self.p2points > self.p1points and self.p1points >= 3):
            result = "avantage " + self.player2Name

        if (self.p1points>=4 and self.p2points>=0 and (self.p1points-self.p2points)>=2):
            result = "jeu pour " + self.player1Name
        if (self.p2points>=4 and self.p1points>=0 and (self.p2points-self.p1points)>=2):
            result = "jeu pour " + self.player2Name
        return result