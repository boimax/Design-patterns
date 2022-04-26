public class CapsLockState implements State {
    @Override
    public void tap(Keyboard keyboard, Key key) {
        switch (key) {
            case CAPSLOCK:
                keyboard.setState(new NormalState());
                System.out.println("CapsLockState OFF ");
                break;
            default:
                System.out.println(key.getvalue().toUpperCase());
        }
    }

}
