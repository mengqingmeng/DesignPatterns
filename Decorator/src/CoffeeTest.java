
public class CoffeeTest {
	public static void main(String[] args) {
		//一个浓缩咖啡，不加配料
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $"+beverage.cost());
		
		//一个深培咖啡，双摩卡
		Beverage beverage1 = new DarkRoast();	//深培咖啡 $0.99
		beverage1 = new Mocha(beverage1);		//深培咖啡 ,摩卡 $1.19
		beverage1 = new Mocha(beverage1);		//深培咖啡 ,摩卡,摩卡	$1.39
		beverage1 = new Whip(beverage1);		//深培咖啡,摩卡,摩卡, 奶泡 $1.49
		System.out.println(beverage1.getDescription()+" $"+beverage1.cost());
	}
}
