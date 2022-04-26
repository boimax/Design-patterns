/*
PrototypePatternDemo uses ShapeCache class to get clones of shapes stored in a HashMap
*/
public class Client {
    public static void main(String[] args) {
        ShapeCache.loadCache(); // 1st: load all khuong da co in cache

        Shape clonedShape1 = (Shape) ShapeCache.getShape("1");
        clonedShape1.draw();

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        clonedShape2.draw();

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        clonedShape3.draw();
    }
}
