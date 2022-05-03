public class LeafGame extends Game {

    public LeafGame(String name, Player player1, Player player2) {
        super(name, player1, player2);
    }

    @Override
    public void showGame() {
        System.out.println("Game: " + this.name);
    }

    @Override
    public void showResult() {
        System.out.println("Result: " + getWinner().getName() + " wins");
    }

    @Override
    public void showPlayer() {
        System.out.println("Player " + player1.getName());
        System.out.println("Player " + player2.getName());
    }

}
