/*
 * SINGLETON PATTERN: JUST CREATE 1 INSTANCE OF MAIN CLASS 
 * 2 MAIN PARTS:
 * - LazySingleton():
 * + private constructor
 * + private static LazySingleton instance
 * + public static LazySingleton getInstance()
 * 
 * -Client: Use LazySingleton to getInstance()
 */
public class SimpleExampleLazySingleton {
    static class LazySingleton {
        private LazySingleton() {
            // MOST IMPORTANT 1: private constructor to prevent object outside class creates
            // new instance
        }

        private static LazySingleton instance;

        public static LazySingleton getInstance() {// MOST IMPORTANT 2: getInstance() to helps other classes can access
                                                   // the instance of this class
            if (instance == null) {
                instance = new LazySingleton();
            }
            return instance;
        }
    }

    public static void main(String[] args) {
        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();
        System.out.println(lazy1 == lazy2);
    }
}
