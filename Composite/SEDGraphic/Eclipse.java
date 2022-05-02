/**
 * The Eclipse Leaf is a basic element of a tree that doesn’t have sub-elements
 */
public class Eclipse implements GraphicComponent {
    private String name;

    public Eclipse(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Eclipse " + name);
    }

}
