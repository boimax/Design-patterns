/*
1. Khai bao private of all classes of Facade class.
2. Creating Facde class CONSTRUCTOR that contains all these classes by using new()
3. Building intended method that accessing method of each child class and may be combine them together
*/
public class ShopFacade {
    private AccountService accountService;
    private PaymentService paymentService;
    private ShippingService shippingService;
    private EmailService emailService;
    private SmsService smsService;

    private static final ShopFacade INSTANCE = new ShopFacade(); // avoid creating new() object in main class

    private ShopFacade() {
        accountService = new AccountService();
        paymentService = new PaymentService();
        shippingService = new ShippingService();
        emailService = new EmailService();
        smsService = new SmsService();
    }

    public static ShopFacade getInstance() {
        return INSTANCE;
    }

    public void buyProductByCashWithFreeShipping(String email) {
        accountService.getAccount(email);
        paymentService.paymentByCash();
        shippingService.freeShipping();
        emailService.sendEmail(email);
        System.out.println("Done\n");
    }

    public void buyProductByPaypalWithStandardShipping(String email, String mobilePhone) {
        accountService.getAccount(email);
        paymentService.paymentByPaypal();
        shippingService.standardShipping();
        emailService.sendEmail(email);
        smsService.sendSMS(mobilePhone);
        System.out.println("Done\n");
    }
}
