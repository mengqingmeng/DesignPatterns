package C02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

interface Movable{
    void move();
}

public class Tank implements Movable {
    @Override
    public void move() {
        //long start = System.currentTimeMillis();
        System.out.println("Tank moving...");
        try {
            Thread.sleep(new Random().nextInt(10000)); // 随机sleep 0-10 秒
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

//        long end = System.currentTimeMillis();
//        System.out.println(end - start);
    }

    public static void main(String[] args) {
        //new Tank().move();

       Tank tank = new Tank();
       Movable movable = (Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(), new Class[]{Movable.class}, new InvocationHandler() {
           public void before(){
               System.out.println("method start...");
           }

           public void after(){
               System.out.println("method stop ...");
           }

           // proxy是代理对象，此处是tank
           @Override
           public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
               before();
               Object o = method.invoke(tank,args);
               after();
               return null;
           }
       });

       movable.move();
    }
}

