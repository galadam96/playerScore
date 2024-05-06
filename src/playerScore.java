public class playerScore {
    public static void main(String[] args) {

        int scorePos = calculateHighScorePosition(1500);
        displayHighScorePosition("Adam",scorePos);
        scorePos = calculateHighScorePosition(999);
        displayHighScorePosition("Bob",scorePos);
        scorePos = calculateHighScorePosition(500);
        displayHighScorePosition("Peter",scorePos);
        scorePos = calculateHighScorePosition(100);
        displayHighScorePosition("Tom",scorePos);
        scorePos = calculateHighScorePosition(25);
        displayHighScorePosition("Raymond",scorePos);
    }

    // Custom Methods
    public static void displayHighScorePosition(String playerName, int scorePosition) {
        System.out.println(playerName + " managed to get into position "
                + scorePosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int result;
        if (playerScore >= 1000) {
            result = 1;
        } else if (playerScore >= 500 ) {
            result = 2;
        } else if (playerScore >= 100) {
            result = 3;
        } else {
            result = 4;
        }


        return result;
    }
}