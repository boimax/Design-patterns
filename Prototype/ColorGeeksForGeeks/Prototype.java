
/*
 * This Prototype pattern example is from GeeksForGeeks
 * PROTOTYPE PATTERN: CREATE NEW OBJECT FROM EXISTING ONE 
 * 4 MAIN PARTS:
 * - Prototype abstract class: clone() + abstract void add()
 * - Concrete prototype classes: has its own void add()
 * - class Cache: HashMap<String, Object> + Prototype getObject() + loadCache()
 * - Client: use Cache.loadCache() + Cache.getObject().add()
 */
import java.util.*;

public class Prototype {
    static abstract class ColorPrototype implements Cloneable {
        protected String colorName;

        abstract void addColor();

        @Override
        public Object clone() {
            Object clone = null;
            try {
                clone = super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return clone;
        }

    }

    static class blueColor extends ColorPrototype {

        @Override
        void addColor() {
            System.out.println("Blue added");

        }

    }

    static class blackColor extends ColorPrototype {

        @Override
        void addColor() {
            System.out.println("Black added");

        }

    }

    static class ColorCache {
        private static Map<String, ColorPrototype> colorMap = new HashMap<String, ColorPrototype>();

        public static void loadColorCache() {
            colorMap.put("Blue", new blueColor());
            colorMap.put("Black", new blackColor());
        }

        public static ColorPrototype getColor(String colorName) {
            return (ColorPrototype) colorMap.get(colorName).clone();
        }
    }

    public static void main(String[] args) {
        ColorCache.loadColorCache();
        ColorCache.getColor("Blue").addColor();

        ColorCache.getColor("Black").addColor();

    }
}
