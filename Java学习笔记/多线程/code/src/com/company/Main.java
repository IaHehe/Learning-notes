package com.company;


import javax.print.attribute.standard.RequestingUserName;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        MyThread myThread = new MyThread();
//        myThread.start();
//        System.out.println("运行结束");

//        try{
//            MyThread1 thread1 = new MyThread1();
//            thread1.setName("myThread");
//            thread1.start();
//            for (int i=0;i<10;i++){
//                int time = (int)(Math.random()*1000);
//                Thread.sleep(time);
//                System.out.println("main=" + Thread.currentThread().getName()+i);
//            }
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }

//        Runnable runnable = new MyRunnable();
//        Thread thread = new Thread(runnable);
//        thread.start();
//        System.out.print("运行结束！");
//        MyThread2 a = new MyThread2("A");
//        MyThread2 b = new MyThread2("B");
//        MyThread2 c = new MyThread2("C");
//        a.start();
//        b.start();
//        c.start();

//        MyThread3 myThread3 = new MyThread3();
//        //以下所有线程指向的都是myThread3这个对象
//        Thread a = new Thread(myThread3,"A");
//        Thread b = new Thread(myThread3,"B");
//        Thread c = new Thread(myThread3,"C");
//        Thread d = new Thread(myThread3,"D");
//        Thread e = new Thread(myThread3,"E");
//        Thread f = new Thread(myThread3,"F");
//        Thread g = new Thread(myThread3,"G");
//        Thread h = new Thread(myThread3,"H");
//        Thread i = new Thread(myThread3,"I");
//        a.start();
//        b.start();
//        c.start();
//        d.start();
//        e.start();
//        f.start();
//        g.start();
//        h.start();
//        i.start();

        ALogin a = new ALogin();
        a.start();
        BLogin b = new BLogin();
        b.start();
    }
}
