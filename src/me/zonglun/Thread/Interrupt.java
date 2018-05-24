package me.zonglun.Thread;

/**
 * @author : Administrator
 * @create 2018-05-24 10:10
 */
public class Interrupt extends Thread {

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 50000; i++) {
            if (this.isInterrupted()) {

            }
            System.out.println("i=" + (i + 1));
        }

    }

}
