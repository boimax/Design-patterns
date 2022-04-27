/*
This example is taken from Tutorpoints.com and also the example in class
*/
public class Client {
    public static void main(String[] args) {
        Shape Circle = ShapeFactory.getShape("Circle");
        Shape Square = ShapeFactory.getShape("Square");
        Shape Rectangle = ShapeFactory.getShape("Rectangle");
    }
}
