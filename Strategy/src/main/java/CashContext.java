// 策略上下文类
public class CashContext {
    // 不同策略的父类
    private ICashSuper ICashSuper;

    // 使用工厂模式创建对象（根据参数创建不同子类对象）
    public CashContext(int type) {
        switch (type) {
            case 1:
                ICashSuper = new CashNormal();
                break;
            case 2:
                ICashSuper = new CashRebate(0.8);
                break;
            default:
                throw new IllegalArgumentException("Wrong number of arguments");
        }
    }

    // 调用不同策略的算法
    public double getResult(double price,int num){
        return this.ICashSuper.acceptCash(price,num);
    }
}
