# Java中几个关键字



## this关键字

1. 在类的方法定义中使用的this关键字代表使用该方法的对象的引用。

2. 当必须指出当前使用方法的对象是谁时要使用this。

3. 有时使用this可以处理方法中成员变量的参数重名的情况。

4. this可以看做是一个变量，它的值是当前对象的引用。

   ​



## static关键字

1. 在类中，用static声明的成员变量为静态成员变量，它为该类的公用变量，在第一次使用时被初始化，对于该类的所有对象来说，static成员变量只有一份。

2. 用static声明的方法为静态方法，在调用该方法时，不会将对象的引用传递给它，所以在static方法中不可以访问非static的成员(**static方法在类加载时就已经存在了，而此时其他非static成员可能因为还没有对象被创立所以不存在**)。静态方法不再是针对于某个对象调用，所以不能访问静态成员。

3. 可以通过对象引用或类名(不需要实例化)访问静态成员。

4. static变量存放在**数据段**

   ```java
   public class Cat{
     private static int sid = 0;
     private String name;
     int id;
     Cat(String name){
       this.name = name;
       id = sid++;
     }
     public void info(){
       System.out.println("My name is "+name+"No."+id);
     }
     public static void main (String arg[]){
       Cat.sid = 100;
       Cat mimi = new Cat("mimi");
       Cat pipi = new Cat("pipi");
       mimi.info();
       pipi.info();
     }
   }
   ```

   ​

## package和import语句

为便于管理大型软件系统中数目众多的类，解决类的命名冲突问题，Java引入包(package)机制，提供类的多重类命名空间。

```Java
package com.xxx.xxx;
```

用import在文件的开头引入要用到的类；例如:

```java
import com.xxx.xxx;
```



## abstract关键词

### 抽象类

在面向对象的概念中，所有的对象都是通过类来描述的，但是反过来，并不是所有的类都是用来描绘对象的，如果一个类中没有足够的信息来描绘一个具体的对象，这样的类就是抽象类。(大志说法，比如"人"这个类就应该设置为抽象类，因为实际上并不存在"人"这样一个对象，他是一个抽象的概念，对象应该是具体的，比如某一个人)

1. 抽象类不能实例化对象, 但类的其他功能依然存在，成员变量、成员方法和构造方法的访问方式和普通类一样。

2. 抽象类必须被继承才能被使用。也是因为这个原因，通常在设计阶段决定要不要设计抽象类。

   ​

---

### 抽象方法

如果要设计一个类，该类包含一个特别的成员方法，该方法的具体实现由它的子类来确定，那么可以在父类中声明该方法为抽象方法。

+ 抽象方法只包含一个方法名，而没有方法体。
+ 抽象方法没有定义，方法名后面直接跟一个分号，而不是花括号。
+ `public abstract double computePay();`

---

### 语法规则

+ 如果一个类包含抽象方法，那么该类必须是抽象类(**抽象类中不一定包含抽象方法**)
+ 任何子类必须重写父类的抽象方法，或者声明自身为抽象类
+ 构造方法，类方法(static修饰的方法)不能声明为抽象方法




## Final关键字

+ final的变量的值不能够被改变
  + final的成员变量
  + final的局部变量(形参)
+ final的方法不能够被重写
+ final的类不能够被继承








## 访问控制

Java权限控制符`public` `protected` `private`置于类的成员定义前，用来限定其对象对该类成员的访问权限。

|    修饰符    | 类内部  | 同一个包 |  子类  | 任何地方 |
| :-------: | :--: | :--: | :--: | :--: |
|  private  | Yes  |      |      |      |
|  default  | Yes  | Yes  |      |      |
| protected | Yes  | Yes  | Yes  |      |
|  public   | Yes  | Yes  | Yes  | Yes  |

对于class的权限修饰只可以用public和default

+ public类可以在任意地方被访问
+ default类只可以被同一个包内部的类访问

