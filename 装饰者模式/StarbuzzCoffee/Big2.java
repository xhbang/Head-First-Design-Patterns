////
public class Big2 extends CondimentDecorator{
	Beverage beverage;
	
	public Big2(Beverage beverage){
		this.beverage=beverage;
	}
	
	public String getDescription(){
		return beverage.getDescription()+",Big2";
	}
	
	public double cost(){
		return 0.20+beverage.cost();
	}
}