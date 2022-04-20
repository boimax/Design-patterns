public class CurrentConditionsDisplay implements Observer, DisplayElements {
	private float temperature;
	private float humidity;
	private float pressure;
	private WeatherData weatherData;
  
	public CurrentConditionsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
  
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}
  
	public void display() {
		System.out.println("CurrentConditionsDisplay [humidity=" + humidity + ", pressure=" + pressure
  + ", temperature=" + temperature + "]");
	}
}