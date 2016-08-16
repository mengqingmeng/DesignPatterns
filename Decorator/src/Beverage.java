/**
 * 饮料抽象类
 * @author MQM
 *
 */
public abstract class Beverage {
	String description = "未知饮料";

	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
	
}
