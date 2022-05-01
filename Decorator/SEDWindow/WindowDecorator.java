/**
 * This is Decorator class EXTENDS + USES component class Window
 */
public abstract class WindowDecorator extends Window {
    Window window;

    @Override
    public abstract String draw();

}
