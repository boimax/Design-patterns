public class Circle extends Shape {

    public Circle(DrawAPI drawAPI) {
        super(drawAPI);
    }

    /*
     * NOTE:
     * This class USES concrete classes of DrawAPI interface, so this draw() method
     * will call the drawCircle() method
     * of each conrete classes above to operate.
     */
    @Override
    public void draw() {
        drawAPI.drawCircle();
    }

}
