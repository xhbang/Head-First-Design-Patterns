//

public class Big extends CondimentDecorator{
	Beverage beverage;
	
	public Big(Beverage beverage){
		this.beverage=beverage;
	}
	public String getDescription(){
		return beverage.getDescription()+",Big One";
	}
	
	public double cost(){
		return beverage.cost*3;
	}
}