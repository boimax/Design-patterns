public class Client {
    public static void main(String[] args) {
        Eclipse eclipse1 = new Eclipse("1");
        Eclipse eclipse2 = new Eclipse("2");

        GraphicComposite composite1 = new GraphicComposite("1");
        composite1.addLeaf(eclipse1);
        composite1.addLeaf(eclipse2);
        composite1.print();
        /**
         * This is Composite 1:
         * Eclipse 1
         * Eclipse 2
         */

        Rectangle rectangle1 = new Rectangle("1");
        Rectangle rectangle2 = new Rectangle("2");

        GraphicComposite composite2 = new GraphicComposite("2");
        composite2.addLeaf(rectangle1);
        composite2.addLeaf(rectangle2);
        composite2.print();
        /**
         * This is Composite 2:
         * Rectangle 1
         * Rectangle 2
         */

        composite1.addGraphicComposite(composite2);
        composite1.print();
        /*
         * composite1
         * | | |
         * eclipse1 eclipse2 composite2
         * | |
         * rectangele1 rectangle2
         */
    }
}
