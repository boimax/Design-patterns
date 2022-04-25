public class ReadyState implements State {
    Player player;

    public ReadyState(Player player) {
        this.player = player;
    }

    @Override
    public void onLock() {
        System.out.println("Changed from Ready to Locked!");
        player.setState(player.getLockState());
    }

    @Override
    public void onNext() {
        System.out.println("Cannot onNext from Ready because of being locked :'()'");
    }

    @Override
    public void onPlay() {
        System.out.println("The player is playing!");
        player.setState(player.getPlayingState());
    }

    @Override
    public void onPrevious() {
        System.out.println("Cannot onPrevious from Ready because of being locked :'()'");
    }

}
