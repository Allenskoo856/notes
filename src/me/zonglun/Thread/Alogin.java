package me.zonglun.Thread;

import me.zonglun.controller.LoginServer;

/**
 * @author : Administrator
 * @create 2018-05-24 9:26
 */
public class Alogin extends Thread {
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
        LoginServer.doPost("a","aa");
    }
}
