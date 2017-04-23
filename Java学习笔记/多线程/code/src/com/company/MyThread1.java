package com.company;

/**
 * Created by 1 on 2017/4/22.
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
        try{
            for (int i=0; i<10; i++){
                int time = (int)(Math.random()*1000);
                Thread.sleep(time);
                System.out.println("run=" + Thread.currentThread().getName()+i);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
