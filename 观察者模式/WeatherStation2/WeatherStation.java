//
public class WeatherStation{
	public static void main(String[] args){
		WeatherData weatherData=new WeatherData();
		
		CurrentConditionDisplay cDisplay=new CurrentConditionDisplay(weatherData);
		ForecastDisplay fDisplay=new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(66,324,534f);
		weatherData.setMeasurements(293,345,344f);
		weatherData.setMeasurements(23,45,234f);
	}
}