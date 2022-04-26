public class Client {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard();

        System.out.println("Testing with Capslock ON adn OFF");
        keyboard.tap(Key.Q);
        keyboard.tap(Key.CAPSLOCK);
        keyboard.tap(Key.Q);
        keyboard.tap(Key.CAPSLOCK);
        keyboard.tap(Key.Q);
    }
}
