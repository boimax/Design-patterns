/*
Object is created only if it is needed. It may overcome resource overcome and wastage of CPU time.
Exception handling is also possible in method.
Every time a condition of null has to be checked.
instance can’t be accessed directly.
In multithreaded environment, it may break singleton property. -CONS
*/
public class LazySingleton {
    private LazySingleton() {
        // private constructor
    }

    private static LazySingleton instance; // private static variable

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
