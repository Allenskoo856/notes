package me.zonglun.Thread;

/**
 * @author : Administrator
 * @create 2018-05-23 22:22
 */
public class MyThread2 extends Thread {
    private int count = 5;

    /**
     * If this thread was constructed using a separate
     * <code>Runnable</code> run object, then that
     * <code>Runnable</code> object's <code>run</code> method is called;
     * otherwise, this method does nothing and returns.
     * <p>
     * Subclasses of <code>Thread</code> should override this method.
     *
     * @see #start()
     * @see #stop()
     * @see
     */
    @Override
    synchronized public void run() {
        super.run();
        count--;
        System.out.println("由 " + Thread.currentThread().getName() + " 计算，count=" + count);
    }
}
