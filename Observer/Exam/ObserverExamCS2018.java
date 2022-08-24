import java.util.*;

public class ObserverExamCS2018 {
    static abstract class Subject {
        public abstract void attach(Observer observer);

        public abstract void detach(Observer observer);

        public abstract void notify(String line);
    }

    static class LineSourceConcreteSubject extends Subject {
        List<Observer> observers = new ArrayList<Observer>();

        @Override
        public void attach(Observer observer) {

            observers.add(observer);
        }

        @Override
        public void detach(Observer observer) {

            observers.remove(observer);
        }

        @Override
        public void notify(String line) {

            for (Observer obs : observers) {
                obs.update(line);
            }
        }

        // Add startProc in this class instead of in main
        public void startProc() {
            System.out.println("Enter Text: ");
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                notify(line);
            }
            scanner.close();
        }

    }

    public interface Observer {
        public void update(String line);
    }

    static class ReceivedObserver implements Observer {

        @Override
        public void update(String line) {

            System.out.println("Received line: " + line);
        }

    }

    static class LengthObserver implements Observer {

        @Override
        public void update(String line) {

            System.out.println("Line Length: " + line.length());
        }

    }

    static class UppercaseObserver implements Observer {

        @Override
        public void update(String line) {

            System.out.println("Uppercase Line: " + line.toUpperCase());
        }

    }

    public static void main(String[] args) {
        LineSourceConcreteSubject lineSource = new LineSourceConcreteSubject();

        ReceivedObserver receivedObserver = new ReceivedObserver();
        LengthObserver lengthObserver = new LengthObserver();
        UppercaseObserver uppercaseObserver = new UppercaseObserver();

        lineSource.attach(receivedObserver);
        lineSource.attach(lengthObserver);
        lineSource.attach(uppercaseObserver);

        lineSource.startProc();

    }

}
