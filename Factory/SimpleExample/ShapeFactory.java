/* NOTE:
This is the factory that can create concrete objects without using new() in main
We SHOULD set method 'getShape' STATIC to direclty access it in client without initializing new ShapeFactory()
*/
public class ShapeFactory {
    public static Shape getShape(String shapeType) {
        switch (shapeType) {
            case "Circle":
                return new Circle();
            case "Square":
                return new Square();
            case "Rectangle":
                return new Rectangle();
            default:
                throw new IllegalArgumentException("Shape not found");
        }
    }
}
