package me.zonglun.Thread;

import org.junit.jupiter.api.Test;

/**
 * @author : Administrator
 * @create 2018-05-23 22:16
 */
public class TestTRead {

    /**
     * 多线程不共享实例变量
     */
    @Test
    public void Test1() {
        MyThread1 a = new MyThread1("A");
        MyThread1 b = new MyThread1("B");
        MyThread1 c = new MyThread1("C");
        a.start();
        b.start();
        c.start();
    }

    @Test
    public void Test2() {
        MyThread2 myThread2 = new MyThread2();
        Thread a = new Thread(myThread2, "A");
        Thread b = new Thread(myThread2, "B");
        Thread c = new Thread(myThread2, "C");
        Thread d = new Thread(myThread2, "D");
        Thread E = new Thread(myThread2, "E");
        a.start();
        b.start();
        c.start();
        d.start();
        E.start();
    }

    @Test
    public void test3() throws InterruptedException {
        IsAlive isAlive = new IsAlive();
        System.out.println("begin == " + isAlive.isAlive());
        isAlive.start();
        Thread.sleep(1000);
        System.out.println("end == " + isAlive.isAlive());
    }

    @Test
    public void test4() {
        try {
            Interrupt interrupt = new Interrupt();
            interrupt.start();
            Thread.sleep(1000);
            Thread.interrupted();
            System.out.println("是否停止1？=" + interrupt.isInterrupted());
            System.out.println("是否停止2？=" + interrupt.isInterrupted());
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
    }

    @Test
    public void test5() {
        MyThread3 thread3 = new MyThread3();
        thread3.start();
        try {
            Thread.sleep(200);
            thread3.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
