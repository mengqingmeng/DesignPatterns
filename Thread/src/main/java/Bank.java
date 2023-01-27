public class Bank {
    private int money;
    private String name;

    public Bank(int money, String name) {this.name = name;this.money = money;}

    public void deposit(int m){
        money += m;
    }

    public boolean withdraw(int m){
        if(money >= m){
            money -= m;
            check();
            return true;
        }

        return false;
    }

    public String getName() {return name;}

    private void check() {
        if(money < 0){
            System.out.println("可用余额为负数！money=" + money + ",Thread name="+ Thread.currentThread().getName());
        }
    }
}

