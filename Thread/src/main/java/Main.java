import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class Main {
    public static void main(String[] args) {
        // 继承Thread
//        MyThread myThread = new MyThread();
//        System.out.println("启动新线程");
//        myThread.start();
//        System.out.println("新线程已启动");
        // 实现Runnable接口
        // new Thread(new MyRunnable()).start();
//        ThreadFactory factory = Executors.defaultThreadFactory();
//        factory.newThread(new MyRunnable()).start();


        Bank bank = new Bank(1000,"BankA");

        new BankClient(bank).start();
        new BankClient(bank).start();
    }
}
