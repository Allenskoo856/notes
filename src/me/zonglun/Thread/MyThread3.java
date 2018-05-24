package me.zonglun.Thread;

/**
 * @author : Administrator
 * @create 2018-05-24 16:09
 */
public class MyThread3 extends Thread {


    @Override
    public void run() {
        super.run();
        System.out.println("run begin");
        try {
            Thread.sleep(200000);
        } catch (InterruptedException e) {
            System.out.println("在沉睡中被停止 ！进入catch！" + this.isInterrupted());
            e.printStackTrace();
        }
    }

}
