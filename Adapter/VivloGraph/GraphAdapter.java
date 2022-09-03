/*
 * ADAPTER PATTERN:  allows objects with incompatible interfaces to collaborate.
 * 4 MAIN PARTS: 
 * - Target Interface: like Client Requirement, has its own implementation
 * 
 * - Adaptee: We already have, also has its own implementation
 * 
 * - ClientRequirementToAdaptee Adapter: implements Client Requirement, has 2 parts:
 * + constructor (Adaptee): to use Adaptee to do action after completing convert ClientRequirementToAdaptee
 * + action(): implemented from Target Interface, convert Client Requirement to Adaptee, then use Adaptee to do action
 * 
 * - Client:  ClientRequirementTargetInterface = new ClientToAlreadyHaveAdapter(AlreadyHaveAdaptee)
 */
public class GraphAdapter {
    public interface CartesianGraphTargetInterface { // TARGET INTERFACE: client require
        void draw(float x, float y); // Has its own implementation
    }

    static class PolarGraphAdaptee { // WE ALREADY HAVE
        void draw(float r, float t) {
            System.out.println("Polar point: " + r + " " + t); // Has its own implementation
        }
    }

    static class CartesianToPolarAdapter implements CartesianGraphTargetInterface {
        /*
         * ADAPTER HAS ADAPTEE -> use ADAPTEE to do action -> constructor line 19 + line
         * 27
         */
        PolarGraphAdaptee polarGraphAdaptee;

        // MOST IMPORTANT 1: Constructor Adapter to use Adaptee
        public CartesianToPolarAdapter(PolarGraphAdaptee polarGraphAdaptee) {
            this.polarGraphAdaptee = polarGraphAdaptee;
        }

        // MOST IMPORTANT 2: Convert from Client requirement to our AlreadyHave
        // implementation
        @Override
        public void draw(float x, float y) {
            float r = (float) Math.sqrt(x * x + y * y);
            float t = (float) Math.atan2(y, x);
            polarGraphAdaptee.draw(r, t);
        }

    }

    public static void main(String[] args) {
        // client requirement = new ClientToAlreadyHaveAdapter(AlreadyHave)
        CartesianGraphTargetInterface cartesianInterface = new CartesianToPolarAdapter(new PolarGraphAdaptee());
        cartesianInterface.draw(3, 4);
    }
}
