public class Client {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        shape1.draw();
        System.out.println();
        // => Drawing Circle

        Shape shape2 = new Circle();
        shape2 = new RedShapeDecorator(shape2);
        shape2.draw();
        System.out.println('\n');
        // => Drawing Circle With Red

        Shape shape3 = new Rectangle();
        shape3 = new RedShapeDecorator(shape3);
        shape3 = new RedShapeDecorator(shape3);
        shape3.draw();
    }
}
