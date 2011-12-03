//
public class StarbuzzCoffee{
	public static void main(String[] args){
		Beverage beverage=new Espresso();
		System.out.println(beverage.getDescription());
		System.out.println("$ "+beverage.cost());
		
		Beverage beverage2=new HouseBlend();
		beverage2=new Mocha(beverage2);
		beverage2=new Whip(beverage2);
		
		Beverage beverage3=new Espresso();
		beverage3=new Mocha(beverage3);
		beverage3=new Big(beverage3);
		
		System.out.println(beverage3.getDescription());
		System.out.println("& "+beverage3.cost());
	}
	
}