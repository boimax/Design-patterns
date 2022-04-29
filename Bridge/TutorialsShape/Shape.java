public abstract class Shape {
    /*
     * NOTE:
     * DrawAPI: protected to be used in child class Circle.
     */
    protected DrawAPI drawAPI;

    /*
     * Chỉ build constructor trong classes of abstract, k cần trong implement
     */
    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    abstract public void draw();
}
