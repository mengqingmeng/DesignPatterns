/**
 * 饮料的实现：浓缩咖啡
 * @author MQM
 * 2016年7月17日 下午12:13:49
 */
public class Espresso extends Beverage {

	public Espresso(){
		description = "浓缩咖啡";	//description 是父类Beverage的属性
	}
	
	@Override
	public double cost() {
		return 1.99;
	}

}
