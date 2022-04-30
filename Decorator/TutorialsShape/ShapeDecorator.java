/**
 * NOTE:
 * Decorator class MUST EXTENDS + USES component class
 */
public abstract class ShapeDecorator extends Shape {
    Shape shape;

    public abstract void draw();
}
