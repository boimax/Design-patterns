import java.util.*;

public class ShapeCompositePattern {
    public interface ShapeComponent {
        void draw();
    }

    static class EclipseLeaf implements ShapeComponent {
        private int id;

        public EclipseLeaf(int id) {
            this.id = id;
        }

        @Override
        public void draw() {
            // TODO Auto-generated method stub
            System.out.println("Eclipse" + id);
        }

    }

    static class RectangleLeaf implements ShapeComponent {
        private int id;

        public RectangleLeaf(int id) {
            this.id = id;
        }

        @Override
        public void draw() {
            // TODO Auto-generated method stub
            System.out.println("Rectangle" + id);
        }

    }

    static class ShapeComposite implements ShapeComponent {
        private int id;
        List<ShapeComponent> shapes = new ArrayList<ShapeComponent>();

        public ShapeComposite(int id) {
            this.id = id;
        }

        public void addLeaf(ShapeComponent leaf) {
            shapes.add(leaf);
        }

        public void addComposite(ShapeComposite composite) {
            shapes.add(composite);
        }

        @Override
        public void draw() {
            // TODO Auto-generated method stub
            System.out.println("Composite " + id);
            for (ShapeComponent shape : shapes) {
                shape.draw();
            }
        }

    }

    public static void main(String[] args) {
        EclipseLeaf eclipse1 = new EclipseLeaf(1);
        EclipseLeaf eclipse2 = new EclipseLeaf(2);
        ShapeComposite composite1 = new ShapeComposite(1);
        composite1.addLeaf(eclipse1);
        composite1.addLeaf(eclipse2);
        // composite1.draw();

        RectangleLeaf rect1 = new RectangleLeaf(1);
        RectangleLeaf rect2 = new RectangleLeaf(2);
        ShapeComposite composite2 = new ShapeComposite(2);
        composite2.addLeaf(rect1);
        composite2.addLeaf(rect2);
        // composite2.draw();

        composite1.addComposite(composite2);
        composite1.draw();

    }
}
