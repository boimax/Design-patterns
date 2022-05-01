public class Client {
    public static void main(String[] args) {
        Window simpleWindow = new SimpleWindow();
        System.out.println(simpleWindow.draw());

        simpleWindow = new VerticalScrollBarDecorator(simpleWindow);
        System.out.println(simpleWindow.draw());

        simpleWindow = new HorizontalScrollBarDecorator(simpleWindow);
        System.out.println(simpleWindow.draw());
    }
}
