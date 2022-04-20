import java.util.*;
 
public class WeatherData implements Subject {
	ArrayList<Observer> observers = new ArrayList<Observer>();
	private float temperature;
	private float humidity;
	private float pressure;
  
	public WeatherData() {
  
	}
  
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}
  
	@Override
	public void removeObserver(Observer o) {
		if (observers.indexOf(o) > 0) {
			observers.remove(o);
		}
	}
  
	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(temperature, humidity, pressure);
		}
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
  
	public float getTemperature() {
		return temperature;
	}
  
	public float getHumidity() {
		return humidity;
	}
  
	public float getPressure() {
		return pressure;
	}
 }
 