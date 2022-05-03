/**
 * Component
 */
public abstract class Game {
    Player player1;
    Player player2;
    String name;
    int player1Score;
    int player2Score;

    public Game(String name, Player player1, Player player2) {
        this.name = name;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void setScore(int player1Score, int player2Score) {
        this.player1Score = player1Score;
        this.player2Score = player2Score;
    }

    public Player getWinner() {
        if (player1Score > player2Score) {
            return player1;
        } else {
            return player2;
        }
    }

    public abstract void showGame();

    public abstract void showResult();

    public abstract void showPlayer();

}
