public class Singleton {
    static class LazySingletonDatabase {
        private LazySingletonDatabase() {
            System.out.println("Connecting...");
        }

        private static LazySingletonDatabase instance;

        public static LazySingletonDatabase getInstance() {
            if (instance == null) {
                instance = new LazySingletonDatabase();
            }
            return instance;
        }

    }

    public static void main(String[] args) {
        LazySingletonDatabase foo = LazySingletonDatabase.getInstance();
        LazySingletonDatabase bar = LazySingletonDatabase.getInstance();
        System.out.println(foo == bar);
    }

}
