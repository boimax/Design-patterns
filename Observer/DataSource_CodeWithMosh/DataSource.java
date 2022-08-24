
/*
 * This example is taken from codewithmosh.com 
 */
import java.util.ArrayList;
import java.util.List;

public class DataSource {
    static abstract class Subject {
        public abstract void attach(Observer observer);

        public abstract void detach(Observer observer);

        public abstract void notifyObservers(int value);
    }

    static class DataSourceConcreteSubject extends Subject {
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
        public void notifyObservers(int value) {

            for (Observer obs : observers) {
                obs.update(value);
            }
        }

    }

    public interface Observer {
        public void update(int value);
    }

    static class SheetConcreteObserver implements Observer {

        @Override
        public void update(int value) {

            System.out.println("Sheet updated " + value);
        }

    }

    static class ChartConcreteObserver implements Observer {

        @Override
        public void update(int value) {

            System.out.println("Chart updated " + value);
        }

    }

    public static void main(String[] args) {
        SheetConcreteObserver sheet1 = new SheetConcreteObserver();
        SheetConcreteObserver sheet2 = new SheetConcreteObserver();
        ChartConcreteObserver chart1 = new ChartConcreteObserver();

        DataSourceConcreteSubject dataSource = new DataSourceConcreteSubject();
        dataSource.attach(sheet1);
        dataSource.attach(sheet2);
        dataSource.attach(chart1);

        dataSource.notifyObservers(2);
    }
}