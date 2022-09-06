public class TournamentCompositePattern {
    static class Player {
        private String name;

        public Player(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    static abstract class GameComponent {
        String name;
        Player player1;
        Player player2;

        int scorePlayer1;
        int scorePlayer2;

        public GameComponent(String name, Player player1, Player player2) {
            this.name = name;
            this.player1 = player1;
            this.player2 = player2;
        }

        public void setScore(int scorePlayer1, int scorePlayer2) {
            this.scorePlayer1 = scorePlayer1;
            this.scorePlayer2 = scorePlayer2;
        }

        public Player getWinner() {
            if (scorePlayer1 > scorePlayer2) {
                return player1;
            } else {
                return player2;
            }

        }

        public void showGame() {
            System.out.println("Game: " + this.name);
        }

        public void showPlayer() {
        }

        public void showResult() {
            System.out.println(name + " result: " + getWinner().getName() + " wins ");
        }

    }

    static class LeafGame extends GameComponent {
        public LeafGame(String name, Player player1, Player player2) {
            super(name, player1, player2);
        }

        @Override
        public void showPlayer() {
            System.out.println("Players in " + name + " game: " + player1.getName() + " and " + player2.getName());
        }

    }

    static class BranchGameComposite extends GameComponent {
        private GameComponent game1;
        private GameComponent game2;

        public BranchGameComposite(String name, GameComponent game1, GameComponent game2) {
            super(name, game1.getWinner(), game2.getWinner()); // similarly to addLeaf + addComposite because
                                                               // game1 and game2 can be LeafGame or
                                                               // BranchGameComposite
            this.game1 = game1;
            this.game2 = game2;
        }

        @Override
        public void showPlayer() {

            System.out.println("Players in " + name + " game: " + game1.getWinner().getName() + " and "
                    + game2.getWinner().getName());

        }

    }

    public static void main(String[] args) {
        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");
        Player player3 = new Player("Player3");
        Player player4 = new Player("Player4");
        Player player5 = new Player("Player5");
        Player player6 = new Player("Player6");
        Player player7 = new Player("Player7");
        Player player8 = new Player("Player8");

        LeafGame quarterFinal1 = new LeafGame("Quarter Final 1", player1, player2);
        LeafGame quarterFinal2 = new LeafGame("Quarter Final 2", player3, player4);
        LeafGame quarterFinal3 = new LeafGame("Quarter Final 3", player5, player6);
        LeafGame quarterFinal4 = new LeafGame("Quarter Final 4", player7, player8);

        quarterFinal1.setScore(2, 4);
        quarterFinal2.setScore(1, 3);
        quarterFinal3.setScore(0, 5);
        quarterFinal4.setScore(1, 2);

        BranchGameComposite semiFinal1 = new BranchGameComposite("Semi Final 1", quarterFinal1, quarterFinal2); // leafgame
                                                                                                                // inside
                                                                                                                // composite
        BranchGameComposite semiFinal2 = new BranchGameComposite("Semi Final 1", quarterFinal3, quarterFinal4);

        semiFinal1.setScore(0, 1);
        semiFinal2.setScore(2, 0);

        BranchGameComposite finalGame = new BranchGameComposite("Final", semiFinal1, semiFinal2); // composite inside
                                                                                                  // composite
        finalGame.setScore(3, 2);

        quarterFinal1.showGame();
        quarterFinal1.showPlayer();
        quarterFinal1.showResult();

        finalGame.showGame();
        finalGame.showPlayer();
        finalGame.showResult();
    }
}
