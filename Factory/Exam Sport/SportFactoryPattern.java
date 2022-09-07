public class SportFactoryPattern {
    public interface Sport {

    }

    static class Badminton implements Sport {
        public Badminton() {
            System.out.println("Badminton");
        }
    }

    static class Zumba implements Sport {
        public Zumba() {
            System.out.println("Zumba");
        }
    }

    static class SportFactory {
        public static Sport getSport(String sportName) {
            switch (sportName) {
                case ("Badminton"):
                    return new Badminton();
                case ("Zumba"):
                    return new Zumba();
                default:
                    throw new IllegalArgumentException("Sport not found");
            }
        }
    }

    public static void main(String[] args) {
        Sport badminton = SportFactory.getSport("Badminton");
        Sport Zumba = SportFactory.getSport("Zumba");
    }
}
