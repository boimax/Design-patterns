/*
 * FACADE PATTERN: provides a simplified interface to a library, a framework, or any other complex set of classes.
 * 3 MAIN PARTS: 
 * 
 * 1. Interface and concrete classes
 * 
 * 2. MOST IMPORTANT PART: ShapeMaker class
 * - private variables of classes
 * - constructor corresponding to feature added in 1 specific method: initialize new private constructors above
 * - doOperation() methods: for each feature, we use private varibles classes above to implement
 * 
 * 3. CLIENT CLASS: use ShapeMaker class to doOperation() methods
 */
public class ShapeFacade {
    public interface Shape {
        void draw();
    }

    static class Rectangle implements Shape {

        @Override
        public void draw() {

            System.out.println(" Draw Rectangle");
        }

    }

    static class Square implements Shape {

        @Override
        public void draw() {

            System.out.println(" Draw Square");
        }

    }

    static class Circle implements Shape {

        @Override
        public void draw() {

            System.out.println(" Draw Circle");
        }

    }

    static class ShapeMaker {// MOST IMPORTANT CLASS
        // MOST IMPORTANT 1
        private Square square;
        private Rectangle rectangle;
        private Circle circle;

        // MOST IMPORTANT 2
        public ShapeMaker() {
            square = new Square();
            rectangle = new Rectangle();
            circle = new Circle();
        }

        // MOST IMPORTANT 3
        public void drawSquare() {
            square.draw();
        }

        public void drawCircle() {
            circle.draw();
        }

        public void drawRectangle() {
            rectangle.draw();
        }
    }

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawSquare();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
    }
}
