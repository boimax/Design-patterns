
/*
REMEMBER: 3 important things 
1. PRIVATE constructor
2. PRIVATE STATIC instance
3. PUBLIC STATIC method getInstance()
*/
import java.time.LocalTime;

public class LazySingletonConnection {
    private LocalTime createdAt;

    private LazySingletonConnection() {
        LocalTime time = LocalTime.now();
        this.createdAt = time;
        System.out.println("A connection has been established at "
                + this.createdAt);
    }

    private static LazySingletonConnection connection; // connection = instance

    public static LazySingletonConnection getConnection() {
        if (connection == null) {
            return new LazySingletonConnection();
        }
        return connection;
    }
}
