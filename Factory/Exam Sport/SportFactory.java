public class SportFactory {
    public static Sport getSport(String SportType) {
        switch (SportType) {
            case "Badminton":
                return new Badminton();
            case "Zumba":
                return new Zumba();
            default:
                throw new IllegalArgumentException("Sport not found");
        }
    }
}
