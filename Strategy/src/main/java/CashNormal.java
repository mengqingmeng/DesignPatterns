public class CashNormal implements ICashSuper {
    @Override
    public double acceptCash(double price, int num) {
        return price * num;
    }
}
