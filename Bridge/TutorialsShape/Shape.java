public abstract class Shape {
    /*
     * NOTE:
     * DrawAPI: protected to be used in child class Circle.
     */
    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    abstract public void draw();
}
