/**
 * The Rectangle Leaf is a basic element of a tree that doesn’t have
 * sub-elements
 */
public class Rectangle implements GraphicComponent {
    private String name;

    public Rectangle(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Rectangle " + name);
    }

}
