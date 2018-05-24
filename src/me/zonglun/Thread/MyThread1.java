package me.zonglun.Thread;

/**
 * @author : Administrator
 * @create 2018-05-23 22:12
 */
public class MyThread1 extends Thread {
    private int count = 5;

    public MyThread1(String name) {
        super();
        this.setName(name);
    }

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
    public void run() {
        super.run();
        while (count > 0) {
            count--;
            System.out.println("由 " + Thread.currentThread().getName() + " 计算，count=" + count);
        }
    }
}
