public class BankClient extends Thread{

    private Bank bank;

    public BankClient(Bank bank){this.bank = bank;}

    @Override
    public void run() {
        while (true) {
            boolean ok = bank.withdraw(1000);
            if(ok) {
                bank.deposit(1000);
            }
        }
    }
}
