/*
This example is in the final SWE Design exam 2020.
With 'static' method getSport in SportFactory, we can use directly this method without creating new SportFactory()
*/
public class Client {
    public static void main(String[] args) {
        Sport Badminton = SportFactory.getSport("Badminton");
        Sport Zumba = SportFactory.getSport("Zumba");
    }
}
