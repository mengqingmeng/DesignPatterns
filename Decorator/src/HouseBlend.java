/**
 * 饮料的实现：综合咖啡
 * @author MQM
 * 2016年7月17日 下午12:18:03
 */
public class HouseBlend extends Beverage {
	public HouseBlend(){
		description = "综合咖啡";
	}
	
	@Override
	public double cost() {

		return 0.89;
	}

}
