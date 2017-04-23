package com.company;

/**
 * Created by 1 on 2017/4/22.
 */
public class ALogin extends Thread {
    public void run(){
        LoginServlet.doPost("a","aa");
    }
}
