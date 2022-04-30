public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.print(" Red");
    }

}
