/*
NOTE: This example is taken from GPCOder
1. Using getInstance() in ShopFacade instead of creating new object() in main class:

    private static final ShopFacade INSTANCE = new ShopFacade();
    public static ShopFacade getInstance() {
        return INSTANCE;
    }
    -->>> Using 'static' to make this belongs to method of ShapeFacade class by default
*/
public class Client {
    public static void main(String[] args) {
        ShopFacade.getInstance().buyProductByCashWithFreeShipping("hocattuong2404@gmail.com");
        ShopFacade.getInstance().buyProductByPaypalWithStandardShipping("nnthuytien@gmail.com", "0969359167");
    }
}
