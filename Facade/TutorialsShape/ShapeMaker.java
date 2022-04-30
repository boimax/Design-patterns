/*
A facade class ShapeMaker uses the concrete classes of Shape interface to delegate user calls to these classes. 
*/
public class ShapeMaker {
    private Shape square;
    private Shape rectangle;
    private Shape circle;

    /*
     * Constructor of Facade ShapeMaker USES & creates all objects in it.
     */
    public ShapeMaker() {
        square = new Square();
        rectangle = new Rectangle();
        circle = new Circle();
    }

    public void drawSquare() {
        square.draw(); // access draw() method of Square class
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawCircle() {
        circle.draw();
    }

}
