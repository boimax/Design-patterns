public class HorizontalScrollBarDecorator extends WindowDecorator {
    public HorizontalScrollBarDecorator(Window window) {
        this.window = window;
    }

    @Override
    public String draw() {
        return window.draw() + " decorated with Horizontal Scroll Bar";
    }

}
