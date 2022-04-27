public class Iphone implements LightningPhone {
    private boolean connector;

    @Override
    public void useLightning() { // just connect Lightning
        connector = true;
        System.out.println("Lightning connected");
    }

    @Override
    public void recharge() {// charge
        if (connector) {
            System.out.println("Recharge started");
            System.out.println("Recharge finished");
        } else {
            System.out.println("Please Connect Lightning first");
        }
    }

}
