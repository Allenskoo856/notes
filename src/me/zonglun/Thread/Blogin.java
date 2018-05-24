package me.zonglun.Thread;

import me.zonglun.controller.LoginServer;

/**
 * @author : Administrator
 * @create 2018-05-24 9:27
 */
public class Blogin extends Thread {
    @Override
    public void run() {
        LoginServer.doPost("b","bb");
    }
}
