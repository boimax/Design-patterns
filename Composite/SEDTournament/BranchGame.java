/**
 * Composite
 */
public class BranchGame extends Game {
    private Game game1;
    private Game game2;

    public BranchGame(String name, Game game1, Game game2) {
        /**
         * BranchGame semifinal(quarterfinal1 & quarterfinal2) = semifinal(player1 =
         * quarterfinal1.getWinner(), player2 = quarterfinal2.getWinner())
         */
        super(name, game1.getWinner(), game2.getWinner());
        /**
         * truyền game1 từ constructor vào biến private game1 để sử dụng cho hàm
         * showPlayer()
         */
        this.game1 = game1;
        this.game2 = game2;
    }

    @Override
    public void showGame() {
        System.out.println("Game: " + this.name);
    }

    @Override
    public void showPlayer() {
        /**
         * 2 players of semifinal = getWinner(quarterfinal1) + getWinner(quarterfinal2)
         */
        System.out.println("Player " + game1.getWinner().getName());
        System.out.println("Player " + game2.getWinner().getName());
    }

    @Override
    public void showResult() {
        /**
         * getWinner() between player1 & player2 in Game class, with player1 =
         * game1.getWinner() & player2 = game2.getWinner(). They are passed in the
         * constructor
         */
        System.out.println("Result: " + getWinner().getName() + " wins");
    }

}
