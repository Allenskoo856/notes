package me.zonglun.controller;

/**
 * @author : Administrator
 * @create 2018-05-24 9:22
 */
public class LoginServer {
    private static String usernameRef;
    private static String passwordRef;

    synchronized public static void doPost(String username, String password) {
        try {
            usernameRef = username;
            if ("a".equals(username)) {
                Thread.sleep(500);
            }
            passwordRef = password;
            System.out.println("userName=" + usernameRef + " password=" + password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
