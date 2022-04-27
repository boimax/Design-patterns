public class Client {
    public static void main(String[] args) {
        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();
        System.out.println(lazy1 == lazy2); // -> true: means lazy1 and lazy2 are in the same address as initialized
                                            // from only 1 object variable
    }
}
