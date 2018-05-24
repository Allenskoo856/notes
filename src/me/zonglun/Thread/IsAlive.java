package me.zonglun.Thread;

/**
 * @author : Administrator
 * @create 2018-05-24 9:56
 */
public class IsAlive extends Thread {
    @Override
    public void run() {
        System.out.println("run=" + this.isAlive());
    }
}
