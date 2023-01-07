public class Main {
    public static void main(String[] args) {

        CashContext cc = new CashContext(2); // 8折算法
        double totalPrices = cc.getResult(10,2);
        System.out.println("totalPrices:" + totalPrices);
    }
}
