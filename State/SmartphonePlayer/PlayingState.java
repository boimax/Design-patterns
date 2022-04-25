public class PlayingState implements State {
    Player player;

    public PlayingState(Player player) {
        this.player = player;
    }

    @Override
    public void onLock() {
        // TODO Auto-generated method stub
        player.setState(player.getLockState());
        System.out.println("Stop playing, changed to Locked state!");
    }

    @Override
    public void onNext() {
        // TODO Auto-generated method stub
        System.out.println("Player is doing onNext!")
        player.nextTrack();
    }

    @Override
    public void onPlay() {
        // TODO Auto-generated method stub
        System.out.println("Player is paused");
        player.setState(player.getReadyState());
    }

    @Override
    public void onPrevious() {
        // TODO Auto-generated method stub
        System.out.println("Player is doing onPrevious!");
        player.previousTrack();
    }

}
