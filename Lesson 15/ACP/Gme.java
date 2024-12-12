class Level {
    private final int level;
    private double levelScore;
    private static double totalScore;

    public Level(int level) {
        this.level = level;
    }

    public void completed() {
        double score = Math.random() * level;
        this.levelScore += score;
        Level.totalScore += score;
    }

    public static double getTotalScore() {
        return Level.totalScore;
    }

    public int getLevel() {
        return this.level;
    }

    public double getLvlScore() {
        return this.levelScore;
    }

    public boolean goalReached(double score) {
        return score >= Math.random();
    }

    public void reset() {
        totalScore = 0;
    }
}

class Game {
    private final Level[] levels = new Level[3];
    private final boolean isBonus; 
    private int mostRecentScore;
    

    public Game() {
        levels[0] = new Level(1);
        levels[1] = new Level(2);
        levels[2] = new Level(3);
        this.isBonus = Math.random() < 0.5;
    }

    public boolean isBonus() {
        return this.isBonus;
    }

    public void play() {
        for (Level level : levels) {
            level.completed();
            boolean goalReached = level.goalReached(level.getLvlScore());
            if (!goalReached) {
                
                break;
            }
        }
    }

    public int getScore() {
        int score = 0;

        if (levels[0].goalReached(levels[0].getLvlScore())) {
            score += levels[0].getLvlScore();

            if (levels[1].goalReached(levels[1].getLvlScore())) {
                score += levels[1].getLvlScore();

                if (levels[2].goalReached(levels[2].getLvlScore())) {
                    score += levels[2].getLvlScore();
                }
            }
        }

        if (isBonus()) {
            score *= 3;
        }

        mostRecentScore = score;
        return score;
    }

    public int playManyTimes(int num) {
        int highestScore = 0;

        for (int i = 0; i < num; i++) {
            play();
            int currentScore = getScore();

            if (currentScore > highestScore) {
                highestScore = currentScore;
            }
        }

        return highestScore;
    }
}

public class Gme {
    public static void main(String[] args) {
        Game game = new Game();
        game.play();
        System.out.println("Score for single game: " + game.getScore());

        int numGames = 5;
        int highestScore = game.playManyTimes(numGames);
        System.out.println("Highest score from " + numGames + " games: " + highestScore);
    }
}
