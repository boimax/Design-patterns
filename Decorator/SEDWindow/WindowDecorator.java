/**
 * This is Decorator class EXTENDS + USES component class Window
 */
public abstract class WindowDecorator implements Window {
    Window decoratedWindow;

    public WindowDecorator(Window window) {
        this.decoratedWindow = window;
    }

    @Override
    public void draw() {
        decoratedWindow.draw();
    }

    @Override
    public String getDescription() {
        return decoratedWindow.getDescription();
    }

    @Override
    public void setDescription(String description) {
        decoratedWindow.setDescription(description);
    }

}
