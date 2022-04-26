
/*
Create a class to get concrete classes from database and store them in a HashMap. Like the factory, but 
already created objects and saved them in HashMap
*/
import java.util.HashMap;

public class ShapeCache {
    private static HashMap<String, Shape> shapeMap = new HashMap<String, Shape>();

    public static Shape getShape(String shapeID) {
        return (Shape) shapeMap.get(shapeID).clone();
    }

    public static void loadCache() {
        shapeMap.put("1", new Circle());
        shapeMap.put("2", new Rectangle());
        shapeMap.put("3", new Square());
    }
}
