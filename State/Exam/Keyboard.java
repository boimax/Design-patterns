public class Keyboard {
    State state = new NormalState();

    public void setState(State state) {
        this.state = state;
    }

    public void tap(KEY key) {
        state.tap(this, key);
    }
}
