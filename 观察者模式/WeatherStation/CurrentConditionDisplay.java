//
public class CurrentConditionDisplay implements Observer,DisplayElement{
	private float temp,humidity;
	private Subject weatherData;
	
	public CurrentConditionDisplay(Subject weatherData){
		this.weatherData=weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(float temp,float humidity,float pressure){
		this.temp=temp;
		this.humidity=humidity;
		display();
	}
	
	public void display(){
		System.out.println("Current Condition Display");
		System.out.println(temp+"degrees and "+humidity+" % humidity");
	}
}