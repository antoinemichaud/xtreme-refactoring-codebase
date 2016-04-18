var expect = require('chai').expect;
var tennisService = require('../../models/tennisService');

describe('Tennis Service', function() {
  describe('tennisService#displayScore()', function () {
    it('should display regular score', function () {
      expect(tennisService.displayScore(1, 0)).to.equal("fifteen-love");
      expect(tennisService.displayScore(1, 2)).to.equal("fifteen-thirty");
      expect(tennisService.displayScore(3, 2)).to.equal("forty-thirty");
    });
    it('should display equality score', function () {
      expect(tennisService.displayScore(0, 0)).to.equal("love-all");
      expect(tennisService.displayScore(1, 1)).to.equal("fifteen-all");
      expect(tennisService.displayScore(2, 2)).to.equal("thirty-all");
      expect(tennisService.displayScore(3, 3)).to.equal("deuce");
      expect(tennisService.displayScore(4, 4)).to.equal("deuce");
    });
    it('should display advantage score', function () {
      expect(tennisService.displayScore(3, 4)).to.equal("advantage player2");
      expect(tennisService.displayScore(4, 3)).to.equal("advantage player1");
      expect(tennisService.displayScore(5, 4)).to.equal("advantage player1");
      expect(tennisService.displayScore(14, 15)).to.equal("advantage player2");
    });
    it('should display victory score', function () {
      expect(tennisService.displayScore(6, 4)).to.equal("win for player1");
      expect(tennisService.displayScore(4, 6)).to.equal("win for player2");
      expect(tennisService.displayScore(16, 14)).to.equal("win for player1");
    });
  });
});