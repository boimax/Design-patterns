/*
This abstract class must implements CLONEABLE
*/
public abstract class Shape implements Cloneable {

    abstract void draw();

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
