package me.zonglun.Thread;

/**
 * @author : Administrator
 * @create 2018-05-24 18:26
 */
public class Mythread4 extends Thread {
    @Override
    public void run() {
        super.run();
    }



    public static void main(String[] args) {
        String s = "123.345.67";
        String[] aa  = s.split(".");
        for (String a : aa) {
            System.out.println(a);
        }
    }
}