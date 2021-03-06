public class PlayingState implements State {
    Player player;

    public PlayingState(Player player) {
        this.player = player;
    }

    @Override
    public void onLock() {
        System.out.println("Stop playing, changed to Locked state!");
        player.setState(player.getLockState());
        player.setCurrentTrackAfterLocked();
    }

    @Override
    public void onNext() {
        System.out.println("Player is doing onNext!");
        player.nextTrack();
    }

    @Override
    public void onPlay() {
        System.out.println("Player is paused");
        player.setState(player.getReadyState());
    }

    @Override
    public void onPrevious() {
        System.out.println("Player is doing onPrevious!");
        player.previousTrack();
    }

}
