import java.time.LocalTime;

public class LazySingletonConnection {
    LocalTime createdAt;

    private LazySingletonConnection() {
        LocalTime time = LocalTime.now();
        this.createdAt = time;
        System.out.println("A connection has been established at "
                + this.createdAt);
    }

    private static LazySingletonConnection connection;

    public static LazySingletonConnection getConnection() {
        if (connection == null) {
            return new LazySingletonConnection();
        }
        return connection;
    }
}
