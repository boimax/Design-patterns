public class VerticalScrollBarDecorator extends WindowDecorator {
    public VerticalScrollBarDecorator(Window window) {
        this.window = window;
    }

    @Override
    public String draw() {
        return window.draw() + " decorated with Vertical Scroll Bar";
    }

}
