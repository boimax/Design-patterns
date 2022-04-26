/* 
The Keyboard is the context class that has the NormalState as the default state and one action tap(). 
*/
public class Keyboard {
    State state = new NormalState();

    public void setState(State state) {
        this.state = state;
    }

    public void tap(Key key) {
        state.tap(this, key);
    }
}
