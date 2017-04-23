package com.company;

/**
 * Created by 1 on 2017/4/22.
 */
public class MyThread2 extends Thread {
    private int count = 5;
    public MyThread2(String name){
        super();
        this.setName(name);
    }

    public void run(){
        super.run();
        while(count>0){
            count--;
            System.out.println("由"+this.currentThread().getName()+"计算，count="+count);
        }
    }
}
