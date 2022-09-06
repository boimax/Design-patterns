/*
 * SHAPE -> COLOR: 1 shape is colored with green, red,... 
 * => SHAPE: ABSTRACTION CLASS; COLOR: IMPLEMENTOR CLASS
 * 
 * 5 MAIN PARTS: 
 * 
 * 1. interface Implementor (DrawColorAPIImplementor): doOperation() actively
 * 
 * 2. concrete implementors: each has its own implementation of doOperation() 
 * 
 * 3. abstract class Abstraction (Shape): 
 * - protected Implementor variables: chua lop Implementor
 * - constructor (Implementor)
 * - abstract method doOperation()
 * 
 * 4. concrete abstraction classes:
 * - constructor: super(implementor variable): put varible into parent abstract class Abstraction
 * - doOperation(): has its own implementation
 * 
 * 5. Client: Use concrete abstraction class to force it and specific implementor class to do sth
 */
public class ShapeColorBridgePattern {
    public interface DrawColorAPIImplementor {
        void drawColor();
    }

    static class Green implements DrawColorAPIImplementor {

        @Override
        public void drawColor() {
            // TODO Auto-generated method stub
            System.out.println(" with green");
        }

    }

    static class Red implements DrawColorAPIImplementor {

        @Override
        public void drawColor() {
            // TODO Auto-generated method stub
            System.out.println(" with red");
        }

    }

    static abstract class Shape {
        DrawColorAPIImplementor drawColorAPI;

        public Shape(DrawColorAPIImplementor drawColorAPI) {
            this.drawColorAPI = drawColorAPI;
        }

        abstract void drawColor();
    }

    static class Circle extends Shape {
        public Circle(DrawColorAPIImplementor drawColorAPI) {
            super(drawColorAPI);
        }

        @Override
        void drawColor() {
            // TODO Auto-generated method stub
            System.out.print("Drawing Circle");
            drawColorAPI.drawColor();
        }

    }

    static class Square extends Shape {
        public Square(DrawColorAPIImplementor drawColorAPI) {
            super(drawColorAPI);
        }

        @Override
        void drawColor() {
            // TODO Auto-generated method stub
            System.out.print("Drawing Square");
            drawColorAPI.drawColor();
        }

    }

    public static void main(String[] args) {
        Shape circleGreen = new Circle(new Green());
        circleGreen.drawColor();

        Shape circleRed = new Circle(new Red());
        circleRed.drawColor();

        Shape squareGreen = new Square(new Green());
        squareGreen.drawColor();

        Shape squareRed = new Square(new Red());
        squareRed.drawColor();
    }
}
