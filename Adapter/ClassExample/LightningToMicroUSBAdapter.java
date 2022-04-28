/*
NOTE: THIS ADAPTER (dây 2 chấu, cắm vào ổ 3 lỗ cắm, thông qua 1 cục adapter chuyển với 1 mặt 2 lỗ, 1 mặt 3 lỗ)
1. implements target interface (MicroUSBPhone): target interface is what client directly communicate
Là mặt có 2 lỗ cắm điện của cục chuyển đổi ổ cắm.
2. composition Adaptee interface (LightningPhone): Adaptee interface is what client have to transit through adapter to communicate.
Là cái ổ cắm điện có 3 lỗ .
*/
public class LightningToMicroUSBAdapter implements MicroUSBPhone { // CompositeToImplements or AdapteeToTarget
    private LightningPhone lightningPhone;

    /*
     * Giúp Iphone vs cổng sạc Lightning có thể dùng được cáp sạc MicroUSB, nên
     * Lightning: Adaptee interface, và Adapter composite nó
     */
    public LightningToMicroUSBAdapter(LightningPhone lightningPhone) {
        this.lightningPhone = lightningPhone;
    }

    /*
     * Do MicroUSB là target interface, nên:
     * 1st: connect dây MicroUSB với mặt MicroUSB của adapter
     * then: use mặt lightning của adapter để charge
     */
    @Override
    public void useMicroUSB() {
        System.out.println("MicroUSB connected");
        lightningPhone.useLightning();
    }

    /*
     * Sau khi connect thành công, recharge()
     */
    @Override
    public void recharge() {
        lightningPhone.recharge();
    }

}
