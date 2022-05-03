public class Client {
    public static void main(String[] args) {
        Player player1 = new Player("P1");
        Player player2 = new Player("P2");
        Player player3 = new Player("P3");
        Player player4 = new Player("P4");
        Player player5 = new Player("P5");
        Player player6 = new Player("P6");
        Player player7 = new Player("P7");
        Player player8 = new Player("P8");

        LeafGame quarterFinal1 = new LeafGame("Quarter Final 1", player1, player2);
        LeafGame quarterFinal2 = new LeafGame("Quarter Final 2", player3, player4);
        LeafGame quarterFinal3 = new LeafGame("Quarter Final 3", player5, player6);
        LeafGame quarterFinal4 = new LeafGame("Quarter Final 4", player7, player8);

        quarterFinal1.setScore(2, 4);
        quarterFinal2.setScore(1, 3);
        quarterFinal3.setScore(0, 5);
        quarterFinal4.setScore(1, 2);

        BranchGame semiFinal1 = new BranchGame("Semi Final 1", quarterFinal1, quarterFinal2);
        BranchGame semiFinal2 = new BranchGame("Semi Final 1", quarterFinal3, quarterFinal4);

        semiFinal1.setScore(0, 1);
        semiFinal2.setScore(2, 0);

        BranchGame finalGame = new BranchGame("Final", semiFinal1, semiFinal2);
        finalGame.setScore(3, 2);

        quarterFinal1.showGame();
        quarterFinal1.showPlayer();
        quarterFinal1.showResult();

        finalGame.showGame();
        finalGame.showPlayer();
        finalGame.showResult();
    }
}
