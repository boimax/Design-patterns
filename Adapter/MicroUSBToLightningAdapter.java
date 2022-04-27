public class MicroUSBToLightningAdapter implements LightningPhone {// CompositionToImplement or AdapteeToTarget
    private MicroUSBPhone microUSBPhone;

    /*
     * Giúp Android vs cổng sạc MicroUSB có thể dùng được cáp sạc Lightning, nên
     * MicroUSB: Adaptee interface, và Adapter composite nó
     */
    public MicroUSBToLightningAdapter(MicroUSBPhone microUSBPhone) {
        this.microUSBPhone = microUSBPhone;
    }

    /*
     * Do Lightning là target interface, nên:
     * 1st: connect dây Lightning với mặt Lightning của adapter
     * then: use mặt MicroUSB của adapter để charge
     */
    @Override
    public void useLightning() {
        System.out.println("Lightning connected");
        microUSBPhone.useMicroUSB();
    }

    @Override
    public void recharge() {
        microUSBPhone.recharge();
    }

}
