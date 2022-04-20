package Observer.Weather;

import java.util.ArrayList;

public class WeatherData implements Subject {
    ArrayList<Observer> observers = new ArrayList<Observer>();
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {

    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
        System.out.println("");
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
