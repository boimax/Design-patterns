/**
 * This is conrete Component class
 */
public class SimpleWindow implements Window {
    String description;

    public SimpleWindow() {
        description = "Simple Window";
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + description);
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

}
