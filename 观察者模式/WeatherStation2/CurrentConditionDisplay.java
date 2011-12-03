import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer,DisplayElement{
	Observable observable;	//还是要存储被观察者相关信息
	private float temp,humidity;
	
	public CurrentConditionDisplay(Observable observable){
		this.observable=observable;
		observable.addObserver(this);
	}
	
	public void update(Observable obs,Object arg){
		if(obs instanceof WeatherData){
			WeatherData weatherData=(WeatherData)obs;
			this.temp=weatherData.getTemp();
			this.humidity=weatherData.getHumidity();
			display();
		}
	}
	
	public void display(){
		System.out.println("Condition Display: "+temp+" degreee "+humidity+" %humidity ");
	
	}
}