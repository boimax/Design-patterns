public class StateExamCS2018 {
    public enum Key {
        CAPSLOCK,
        Q("q");

        private String value;

        Key() {
            // constructor for CAPSLOCK
        }

        Key(String value) {
            // constructor for Q("q")
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    static class Keyboard {
        State state = new NormalState(); // IMPORTANT: SET DEFAULT STATE TO MAKE tap() KNOW WHAT STATE IS ACTIVE AT THE
                                         // BEGINNING

        public void setState(State state) { // MOST IMPORTANT OF STATE PATTERN => CHANGE STATE
            this.state = state;
        }

        public void tap(Key key) {// INSERT FUNCTION INTO CONTEXT CLASS SO THAT CLIENT CAN CONTACT DIRECTLY
                                  // WITHOUT USING CONCRETE STATE
            state.tap(this, key);
        }
    }

    public interface State {
        void tap(Keyboard keyboard, Key key);
    }

    static class NormalState implements State {

        @Override
        public void tap(Keyboard keyboard, Key key) {
            // ADD KEYBOARD TO CHANGE STATE
            switch (key) {
                case CAPSLOCK:
                    System.out.println("CAPSLOCK ON");
                    keyboard.setState(new CapslockState());
                    break; // MUST HAVE
                default:
                    System.out.println(key.getValue());
            }
        }

    }

    static class CapslockState implements State {

        @Override
        public void tap(Keyboard keyboard, Key key) {
            // ADD KEYBOARD TO CHANGE STATE
            switch (key) {
                case CAPSLOCK:
                    System.out.println("CAPSLOCK OFF");
                    keyboard.setState(new NormalState());
                    break; // MUST HAVE
                default:
                    System.out.println(key.getValue().toUpperCase());
            }
        }

    }

    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard();

        keyboard.tap(Key.Q); // => IT WORKS BECAUSE WE ALREADY HAD 2 CONSTRUCTORS FOR CAPSLOCK AND Q IN KEY
                             // CLASS
        keyboard.tap(Key.CAPSLOCK);
        keyboard.tap(Key.Q);
        keyboard.tap(Key.CAPSLOCK);
        keyboard.tap(Key.Q);
    }
}
