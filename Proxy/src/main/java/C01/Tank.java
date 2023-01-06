package C01;

import java.util.Random;

interface Movable{
    void move();
}

// 代理Tank类型
// Movable类型代理
class TankTimeProxy implements Movable{

    Movable mov;
    public TankTimeProxy(Movable movable){
        this.mov = movable;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        mov.move();
        long end = System.currentTimeMillis();
        System.out.println("time cost :" + (end - start));
    }
}

class TankLogProxy implements Movable{
    Movable mov;
    public TankLogProxy(Movable movable){
        this.mov = movable;
    }

    @Override
    public void move() {
        System.out.println("start move");
        mov.move();
        System.out.println("stop move");
    }
}
public class Tank implements Movable{
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

        new TankLogProxy(new TankTimeProxy(new Tank())).move();
    }
}
