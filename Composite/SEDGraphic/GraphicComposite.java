
/**
 * The Container (aka composite) is an element that has sub-elements: leaves or
 * other containers. A container doesn’t know
 * the concrete classes of its children. It works with all sub-elements only via
 * the component interface.
 *
 * Upon receiving a request, a container delegates the work to its
 * sub-elements, processes intermediate results and then returns
 * the final result to the client.
 */
import java.util.ArrayList;
import java.util.List;

public class GraphicComposite implements GraphicComponent {
    private String name;
    private List<GraphicComponent> graphicRepo = new ArrayList<GraphicComponent>();

    public GraphicComposite(String name) {
        this.name = name;
    }

    // add Leaf
    public void addLeaf(GraphicComponent graphic) {
        graphicRepo.add(graphic);
    }

    // add list of leafs
    public void addListLeafs(List<GraphicComponent> graphic) {
        graphicRepo.addAll(graphic);
    }

    // add another graphicComposite
    public void addGraphicComposite(GraphicComposite composite) {
        graphicRepo.add(composite);
    }

    @Override
    public void print() {
        System.out.println("This is Composite " + name + ":");
        for (GraphicComponent component : graphicRepo) {
            component.print();
        }
    }

}
