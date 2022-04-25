public class LockedState implements State {
    Player player;

    public LockedState(Player player) {
        this.player = player;
    }

    @Override
    public void onLock() {
        if (player.getState() == player.getPlayingState()) {
            System.out.println("Stop Playing");
            player.setState(player.getReadyState());
        } else {
            System.out.println("Already locked!");
        }
    }

    @Override
    public void onNext() {
        System.out.println("Cannot onNext because of being locked :'(");
    }

    @Override
    public void onPlay() {// Unlock
        player.setState(player.getReadyState());
        System.out.println("Ready");
    }

    @Override
    public void onPrevious() {
        System.out.println("Cannot onPrevious because of being locked :'(");
    }

}
