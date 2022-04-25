public class ReadyState implements State {
    Player player;

    public ReadyState(Player player) {
        this.player = player;
    }

    @Override
    public void onLock() {
        // TODO Auto-generated method stub
        player.setState(player.getLockState());
        System.out.println("Changed from Ready to Locked!");
    }

    @Override
    public void onNext() {
        // TODO Auto-generated method stub
        System.out.println("Cannot onNext from Ready because of being locked :'()'");
    }

    @Override
    public void onPlay() {
        // TODO Auto-generated method stub
        player.setState(player.getPlayingState());
        System.out.println("The player is playing!");
    }

    @Override
    public void onPrevious() {
        // TODO Auto-generated method stub
        System.out.println("Cannot onPrevious from Ready because of being locked :'()'");
    }

}
