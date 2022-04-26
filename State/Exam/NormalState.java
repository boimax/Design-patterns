public class NormalState implements State {
    @Override
    public void tap(Keyboard keyboard, Key key) {
        switch (key) {
            case CAPSLOCK:
                keyboard.setState(new CapsLockState());
                System.out.println("CapsLockState ON");
                break;
            default:
                System.out.println(key.getvalue());
        }
    }

}
