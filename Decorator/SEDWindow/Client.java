public class Client {
    public static void main(String[] args) {
        Window simpleWindow = new SimpleWindow();

        System.out.println("\n===================Simple window===================");
        // simple window
        simpleWindow.draw();
        System.out.println("Description: " + simpleWindow.getDescription());

        System.out.println("\n====================with Verical==================");
        // simpel window with vertical scrollbar
        Window vScrollWindow = new VerticalScrollBarDecorator(simpleWindow);
        vScrollWindow.draw();
        System.out.println("Description: " + vScrollWindow.getDescription());

        System.out.println("\n===================with vertical and horizontal===================");
        // simple window with fulll scrollbar
        Window fullWindow = new HorizontalScrollBarDecorator(simpleWindow);
        fullWindow.draw();
        System.out.println("Description: " + fullWindow.getDescription());
    }
}
