
/*
 * This Prototype pattern example is from GeeksForGeeks
 * PROTOTYPE PATTERN: CREATE NEW OBJECT FROM EXISTING ONE 
 * 4 MAIN PARTS:
 * - Prototype abstract class: 
 * + Object clone() 
 * + abstract void add()
 * 
 * - Concrete prototype classes: has its own void add()
 * 
 * - static class Cache: 
 * + private static HashMap<String, Object> 
 * + public static Prototype getObject(): getObject from HashMap.clone() to copy new one
 * + loadCache(): put data into HashMap to clone in getShape()
 * 
 * - Client: use Cache.loadCache() + Cache.getObject().add()
 */
import java.util.*;

public class Prototype {
    static abstract class ShapePrototype implements Cloneable {
        String shapeName;

        abstract void addShape();

        @Override
        public Object clone() { // MOST IMPORTANT 1: dataType of clone(): Object
            Object clone = null;
            try {
                clone = super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return clone;
        }
    }

    static class Circle extends ShapePrototype {

        @Override
        void addShape() {

            System.out.println("Circle added");
        }

    }

    static class Square extends ShapePrototype {

        @Override
        void addShape() {

            System.out.println("Square added");
        }

    }

    static class Rectangle extends ShapePrototype {
        @Override
        void addShape() {
            System.out.println("Rectangle added");
        }
    }

    static class ShapeCache {
        private static Map<String, ShapePrototype> shapeCache = new HashMap<String, ShapePrototype>();

        public static ShapePrototype getShape(String shapeName) { // MOST IMPORTANT: Clone() object that was got from
            // shapeCache
            return (ShapePrototype) shapeCache.get(shapeName).clone();
        }

        public static void loadCache() {
            shapeCache.put("Square", new Square());
            shapeCache.put("Circle", new Circle());
            shapeCache.put("Rectangle", new Rectangle());
        }
    }

    public static void main(String[] args) {
        ShapeCache.loadCache();
        ShapeCache.getShape("Square").addShape();
        ShapeCache.getShape("Circle").addShape();
        ShapeCache.getShape("Rectangle").addShape();
    }

}
