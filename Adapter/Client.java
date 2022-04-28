public class Client {

    static void rechargeMicroUSBPhone(MicroUSBPhone microUSBPhone) {
        microUSBPhone.useMicroUSB();
        microUSBPhone.recharge();
    }

    static void rechargeLightningPhone(LightningPhone lightningPhone) {
        lightningPhone.useLightning();
        lightningPhone.recharge();
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        Android android = new Android();
        Huawei huawei = new Huawei();

        // recharge normally
        System.out.println("=============Recharge Lightning phone================");
        rechargeLightningPhone(iphone);
        System.out.println("============Recharge MicroUSB phone============");
        rechargeMicroUSBPhone(android);
        rechargeMicroUSBPhone(huawei);

        /**
         * EXPLAIN
         * Client use mircroUSB
         * Client need to charge iPhone (which is lightning) => which is now
         * incompatiple
         * ==> mircoUSB is target and LightningPhone (which include Iphone) is adaptee
         * ==> Use Adapter to conver Lighnight to MircoUSB to recharge
         */

        System.out.println("============Recharge Iphone by MicroUSB============");
        rechargeMicroUSBPhone(new LightningToMicroUSBAdapter(iphone));

        /**
         * EXPLAIN
         * Client use Lighning
         * Client need to charge Android (which is MircoUSB) => which is now
         * incompatiple
         * ==> Lightning is target and MircoUSB (which include Android) is adaptee
         * ==> Use Adapter to convert MircoUSB to Lighning to recharge
         */
        System.out.println("============Recharge Android by Lightning============");
        rechargeLightningPhone(new MicroUSBToLightningAdapter(android));

        System.out.println("============Recharge Huawei by Lightning=============");
        rechargeLightningPhone(new MicroUSBToLightningAdapter(huawei));
    }

}
