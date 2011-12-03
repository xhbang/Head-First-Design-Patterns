//
public class SonicDisplay implements Observer,DisplayElement{
	private float temp,humidity,pressure;
	
	public SonicDisplay(WeatherData data){
		data.registerObserver(this);
	}
	
	public void update(float temp,float humidity,float pressure){
		display(temp,humidity,pressure);
	}
	
	public void display(){
		System.out.println(" ");
		System.out.println("SONIC SAYS:");
	}
	
	public void display(float temp,float humidity,float pressure){
		display();
		System.out.println(temp+" degree");
		System.out.println("");
	}
}