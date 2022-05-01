/**
 * This is conrete Component class
 */
public class SimpleWindow extends Window {

    public SimpleWindow() {
        description = "Simple Window";
    }

    @Override
    public String draw() {
        return "Drawing Simple Window";
    }

}
