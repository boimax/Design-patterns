public class Client {
    public static void main(String[] args) {
        LazySingletonConnection connection1 = LazySingletonConnection.getConnection();
        LazySingletonConnection connection2 = LazySingletonConnection.getConnection();
        System.out.println(connection1 == connection2);// False
    }
}
