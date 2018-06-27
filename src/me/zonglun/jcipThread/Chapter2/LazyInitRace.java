package me.zonglun.jcipThread.Chapter2;

import net.jcip.annotations.*;

/**
 * LazyInitRace
 *
 * Race condition in lazy initialization
 *
 * @author Brian Goetz and Tim Peierls
 */

@NotThreadSafe
public class LazyInitRace {

    private ExpensiveObject instance = null;

    /**
     * 竞态条件的显示
     * @return
     */
    public ExpensiveObject getInstance() {
        if (instance == null) {
            instance = new ExpensiveObject();
        }
        return instance;
    }

class ExpensiveObject { }}


