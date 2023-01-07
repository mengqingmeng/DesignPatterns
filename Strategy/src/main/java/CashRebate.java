public class CashRebate implements ICashSuper {
    private double moneyRebate = 1d;

    public CashRebate(double rebate) {
        this.moneyRebate = rebate;
    }

    @Override
    public double acceptCash(double price, int num) {
        return price * num * moneyRebate;
    }
}
