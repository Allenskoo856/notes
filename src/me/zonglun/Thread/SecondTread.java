package me.zonglun.Thread;

/**
 * @author : Administrator
 * @create 2018-05-23 21:10
 */
public class SecondTread implements Runnable {
    private int i;
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        for (; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 20) {
                SecondTread st = new SecondTread();
                new Thread(st, "Thread1").start();
                new Thread(st,"Thread2").start();
            }
        }
    }
}
