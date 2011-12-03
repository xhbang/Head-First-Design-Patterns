//
import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer,DisplayElement{
	private float currentPressure=29.93f;
	private float lastPressure;
	
	public ForecastDisplay(Observable observable){
		observable.addObserver(this);
	}
	
	public void update(Observable observable,Object arg){
		if(observable instanceof WeatherData){
			WeatherData data=(WeatherData)observable;
			lastPressure=currentPressure;
			currentPressure=data.getPressure();
			display();
		}
	}
	
	public void display(){
		System.out.println("last pressure is  "+lastPressure+" Now is: "+currentPressure);
	}
}