/**
 * 摩卡饮料：具体装饰类 实现者
 * @author MQM
 * 2016年7月17日 下午12:33:38
 */
public class Mocha extends CondimentDecorator {
	Beverage beverage;//用实例变量记录饮料，也就是被装饰着
	
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		
		return beverage.getDescription() + ",摩卡";
	}

	@Override
	public double cost() {
		
		return 0.2 + beverage.cost();
	}

}
