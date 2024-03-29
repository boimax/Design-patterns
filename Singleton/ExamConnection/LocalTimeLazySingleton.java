import java.time.LocalTime;

public class LocalTimeLazySingleton {

    static class LazySingleton {
        private LocalTime time;

        private LazySingleton() { // MOST IMPORTANT 1: private constructor, can add more implementation or can be
                                  // empty
            this.time = LocalTime.now();
            System.out.println("A connection has been established at " + this.time);
        }

        private static LazySingleton instance; // MOST IMPORTANT 2: private instance

        public static LazySingleton getInstance() { // MOST IMPORTANT 3: PUBLIC getInstance()
            if (instance == null) {
                instance = new LazySingleton();
            }
            return instance;
        }
    }

    public static void main(String[] args) {
        LazySingleton lazy1 = LazySingleton.getInstance(); // output: A connection has been established at...
        LazySingleton lazy2 = LazySingleton.getInstance(); // no output
        System.out.println(lazy1 == lazy2);
    }
}
