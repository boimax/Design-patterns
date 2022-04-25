/*
This example is taken from refactoring_guru.
*/
public class Client {
    public static void main(String[] args) {
        Player player = new Player(10); // number of Tracks
        player.onPlay();
        player.onNext();
        player.onPrevious();
        player.onLock();
    }
}
