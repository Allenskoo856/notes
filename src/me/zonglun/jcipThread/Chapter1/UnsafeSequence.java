package me.zonglun.jcipThread.Chapter1;

/**
 * @author : Administrator
 * @create 2018-06-13 21:11
 */
public class UnsafeSequence {

    private int value;

    /**
     * Returns a unique value.
     */
    public int getNext() {
        return value++;
    }
}
