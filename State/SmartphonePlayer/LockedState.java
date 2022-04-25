public class LockedState implements State {
    Player player;

    public LockedState(Player player) {
        this.player = player;
    }

    @Override
    public void onLock() {
        // TODO Auto-generated method stub
        if (player.getState() == PlayingState) {
            System.out.println("Stop Playing");
            player.setState(player.getReadyState());
        } else {
            System.out.println("Already locked!");
        }
    }

    @Override
    public void onNext() {
        // TODO Auto-generated method stub
        System.out.println("Cannot onNext because of being locked :'(");
    }

    @Override
    public void onPlay() {// Unlock
        // TODO Auto-generated method stub
        player.setState(player.getReadyState());
        System.out.println("Ready");
    }

    @Override
    public void onPrevious() {
        // TODO Auto-generated method stub
        System.out.println("Cannot onPrevious because of being locked :'(");
    }

}
