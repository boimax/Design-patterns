import java.util.ArrayList;

/*
This is the Context that is the class that can have a number of internal states.
Whenever the request() is made on the Context it is delegated to the state to handle
*/
public class Player {
    private State state;
    private State LockedState;
    private State PlayingState;
    private State ReadyState;
    ArrayList<String> playlist = new ArrayList<String>();
    private int currentTrack = 0;

    public Player(int numberOfTracks) {
        LockedState = new LockedState(this);
        PlayingState = new PlayingState(this);
        ReadyState = new ReadyState(this);
        for (int i = 1; i <= numberOfTracks; i++) {
            playlist.add("Track " + (i - 1));
        }
        if (numberOfTracks > 0) {
            state = ReadyState;
            currentTrack = 1;
        } else {
            state = LockedState;
        }
    }

    public void startPlaying() {
        System.out.println("Playing " + playlist.get(currentTrack));
    }

    public void nextTrack() {
        currentTrack++;
        if (currentTrack > playlist.size()) {
            currentTrack = 1;
        }
        System.out.println("Playing " + playlist.get(currentTrack));
    }

    public void previousTrack() {
        currentTrack--;
        if (currentTrack < 1) {
            currentTrack = playlist.size();
        }
        System.out.println("Playing " + playlist.get(currentTrack));
    }

    public void setCurrentTrackAfterLocked() {
        currentTrack = 0;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void onLock() {
        state.onLock();
    }

    public void onPlay() {
        state.onPlay();
    }

    public void onNext() {
        state.onNext();
    }

    public void onPrevious() {
        state.onPrevious();
    }

    public State getState() {
        return this.state;
    }

    public State getLockState() {
        return LockedState;
    }

    public State getReadyState() {
        return ReadyState;
    }

    public State getPlayingState() {
        return PlayingState;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nJava-enabled SmartphonePlayer 2022");
        result.append("\n");
        result.append("The player is " + state + "\n");
        return result.toString();
    }
}
