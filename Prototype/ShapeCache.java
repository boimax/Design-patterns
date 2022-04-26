import java.util.HashMap;

public class ShapeCache {
    private static HashMap<String, Shape> shapeMap = new HashMap<String, Shape>();

    public static void loadCache() {
        shapeMap.put("1", new Circle());
        shapeMap.put("2", new Rectangle());
        shapeMap.put("3", new Square());
    }

    public static Shape getShape(String shapeID) {
        return (Shape) shapeMap.get(shapeID).clone();
    }
}
