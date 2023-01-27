public class MyThread extends Thread{
    @Override
    public void run() {
        for(int i = 0; i <1000;i++){
            System.out.println("Nice Thread " + i);
        }

        System.out.println("My Thread 执行结束");
    }
}
