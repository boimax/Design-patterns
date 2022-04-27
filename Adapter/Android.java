public class Android implements MicroUSBPhone {
    private boolean connector = false;

    @Override
    public void useMicroUSB() {// just connect to MicroUSB
        connector = true;
        System.out.println("MicroUSB connected");
    }

    @Override
    public void recharge() {// charge
        if (connector) {
            System.out.println("Recharge started");
            System.out.println("Recharge finished");
        } else {
            System.out.println("Please Connect MicroUSB first");
        }
    }

}
