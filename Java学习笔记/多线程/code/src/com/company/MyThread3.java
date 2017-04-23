package com.company;

/**
 * Created by 1 on 2017/4/22.
 */
public class MyThread3 extends Thread {
    private int count=10;
    public void run(){
        super.run();
        count--;
        System.out.println("由"+this.currentThread().getName()+"计算，count="+count);
    }
}
