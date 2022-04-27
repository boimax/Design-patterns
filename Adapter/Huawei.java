public class Huawei implements MicroUSBPhone {
    private boolean connector = false;

    @Override
    public void useMicroUSB() {// connect to MicroUSB first
        connector = true;
        System.out.println("MicroUSB connected");
    }

    @Override
    public void recharge() {// charge
        if (connector) {
            System.out.println("Recharge started");
            System.out.println("Recharge finished");
        } else {
            System.out.println("Please Connect to MicroUSB first");
        }
    }

}
