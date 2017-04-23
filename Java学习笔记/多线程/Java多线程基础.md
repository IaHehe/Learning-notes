# Java多线程基础

主要掌握Thread类中的核心方法 ，主要内容如下:

+ 线程的启动
+ 线程的暂停
+ 线程的停止
+ 线程的优先级
+ 线程安全



## 进程

进程就是一个独立的程序，是受操作系统管理的基本运行单元

## 线程

线程是在进程中独立运行的子任务



> [阮一峰的博客对进程线程的理解](http://www.ruanyifeng.com/blog/2013/04/processes_and_threads.htl)



## Java使用多线程

Java中创建新的线程有两种方法，一种是继承Thread类，另一种是实现Runnable接口

Thread类的结构如下；

```java
public class Thread implements Runnable
```

Thread类实现了Runnable接口，他们之间具有多态关系