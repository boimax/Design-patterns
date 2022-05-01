public class HorizontalScrollBarDecorator extends WindowDecorator {
    public HorizontalScrollBarDecorator(Window window) {
        super(window);
    }

    private void drawHorizontalScrollBar() {
        super.setDescription(super.getDescription() + " horizontal scroll bar");
    }

    @Override
    public void draw() {
        drawHorizontalScrollBar();
        super.draw();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

}
