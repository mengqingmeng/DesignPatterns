/**
 * 配料 奶泡 装饰着 实现类
 * @author MQM
 * 2016年7月17日 下午1:33:49
 */
public class Whip extends CondimentDecorator {
	Beverage beverage;
	
	public Whip(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 奶泡";
	}
	
	@Override
	public double cost() {
		
		return 0.1 + beverage.cost();
	}


}
