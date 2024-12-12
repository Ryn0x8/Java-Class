class WordMacth {
    private final String secret;

    public WordMacth(String word) {
        this.secret = word;
    }

    public int scoreGuess(String guess) {
        int occurrences = 0;
        for (int i = 0; i <= secret.length() - guess.length(); i++) {
            if (secret.substring(i, i + guess.length()).equals(guess)) {
                occurrences++;
            }
        }
        return occurrences * guess.length() * guess.length();
    }

    public String findBetterGuess(String guess1, String guess2) {
        int score1 = scoreGuess(guess1);
        int score2 = scoreGuess(guess2);
        if (score1 > score2) {
            return guess1;
        } else if (score2 > score1) {
            return guess2;
        } else {
            return guess1.compareTo(guess2) > 0 ? guess1 : guess2;
        }
    }
}

public class WordMatch {
    public static void main(String[] args) {
        WordMacth game = new WordMacth("GOODD");
        System.out.println(game.scoreGuess("GOO"));
        System.out.println(game.scoreGuess("OODD"));
        System.out.println(game.findBetterGuess("GOO", "OODD"));
    }
}
