package me.zonglun.Thread;

/**
 * @author : Administrator
 * @create 2018-05-23 20:10
 */
public class FristTread extends Thread {
    private int i;

    // 重写run()方法，run()方法的方法体就是线程执行
    @Override
    public void run() {
        for (; i < 100; i++) {
            System.out.println(getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 20) {
                new FristTread().start();
                new FristTread().start();
            }
        }
    }
}
