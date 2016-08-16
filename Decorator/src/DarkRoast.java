/**
 * 饮料的实现：深培咖啡
 * @author MQM
 * 2016年7月17日 下午12:23:13
 */
public class DarkRoast extends Beverage {

	public DarkRoast(){
		description = "深培咖啡";
	}
	
	@Override
	public double cost() {

		return 0.99;
	}

}
