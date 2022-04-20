/*
This is the 1st concrete subject
*/
package Observer.Exam;

import java.util.ArrayList;

public class LineSource implements Subject {
    private String lineSourceScanner;
    ArrayList<Observer> observers = new ArrayList<Observer>();

    public LineSource() {

    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(lineSourceScanner);
        }
        System.out.println("");
    }

    public void lineSourceChanged() {
        notifyObservers();
    }

    public void setLineSource(String lineSourceScanner) {
        this.lineSourceScanner = lineSourceScanner;
        lineSourceChanged();
    }
}
