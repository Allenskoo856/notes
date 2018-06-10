package me.zonglun.Thread;

import java.util.Scanner;

/**
 * @author : Administrator
 * @create 2018-05-31 18:59
 */
public class ScannerTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String x = in.nextLine();
        }
    }
}
