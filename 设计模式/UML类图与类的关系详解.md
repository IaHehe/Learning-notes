# UML类图与类的关系详解

类的关系有泛化(Generalization)、实现(Realization)、依赖(Dependency)和关联(Association)。其中关联又分为一般关联关系和聚合关系(Aggregation)，合成关系(Composition)。



## 基本概念

类图(Class Diagram)：类图是面向对象系统建模中最常用和最重要的图，是定义其他图的基础。类图主要是用来显示系统中的类、接口和他们之间的静态结构和关系的一种静态模型。

类图的三个基本组件：类名、属性、方法。

![img](http://www.uml.org.cn/oobject/images/afca0365.jpg)



## 泛化关系(Generalization)

表示is-a的关系，是对象之间耦合度最大的一种关系，子类继承父类的所有细节。直接使用语言中的继承表达。在类图中使用**带三角箭头的实线**表示，箭头从子类指向父类。

![img](http://www.uml.org.cn/oobject/images/df7a6535.jpg)

![img](http://my.csdn.net/uploads/201206/07/1339064113_3688.png)

```java
public class Person   
{  
    protected String name;  
    protected int age;  
    public void move()   
    {  
        ……  
    }  
    public void say()   
   {  
        ……  
    }  
}  
public class Student extends Person   
{  
    private String studentNo;  
    public void study()   
    {  
        ……  
    }  
}  
```



## 实现关系(Realization)

在类图中就是接口和实现的关系。在类图中使用带三角箭头的虚线表示，箭头从实现类指向接口。

接口之间也可以有与类之间关系类似的继承关系和依赖关系，但是接口和类之间还存在一种实现关系(Realization)，在这种关系中，类实现了接口，类中的操作实现了接口中所     声明的操作。在UML中，类与接口之间的实现关系用带空心三角形的虚线来表示。

![img](http://www.uml.org.cn/oobject/images/0c834dc1.jpg)

![img](http://my.csdn.net/uploads/201206/07/1339065434_3587.png)

```java
public interface Vehicle   
{  
    public void move();  
}  
public class Ship implements Vehicle  
{  
    public void move()   
    {  
    ……  
    }  
}  
public class Car implements Vehicle  
{  
    public void move()   
    {  
    ……  
    }  
}  
```



## 依赖(Dependency)

> 假设A类的变化引起了B类的变化，则说明B类依赖于A类

对象之间最弱的一种关联方式，是临时性的关联。代码中一般指局部变量、函数参数、返回值建立的对于其他对象的调用关系。一个类调用被依赖类中的某些方法而得以完成这个类的一些职责。在类图中使用**带箭头的虚线**表示，箭头从使用类指向被依赖的类。

![img](http://www.uml.org.cn/oobject/images/3c13e1c1.jpg)

![img](http://my.csdn.net/uploads/201206/07/1339063909_4768.png)

```Java
public class Driver  
{  
    public void drive(Car car)  
    {  
        car.move();  
    }  
    ……  
}  
public class Car  
{  
    public void move()  
    {  
        ......  
    }  
    ……  
}  
```





## 关联关系(Association)

> 类之间的联系，如客户和订单，每个订单对应特定的客户，每个客户对应一些特定的订单，再如篮球队员与球队之间的关联。

对象之间的一种引用关系，比如客户类与订单类之间的关系。这种关系通常使用类的属性表达。关联又分为一般关联、聚合与组合关联。在类图中使用**带箭头的实线**表示，箭头从使用类指向被关联的类。可以是单向和双向。

他体现的是两个类、或者类与接口之间语义级别的一种强依赖关系，比如我和我的朋友；这种关系比依赖更强、不存在依赖关系的偶然性、关系也不是临时性的，一般是长期性的，而且双方的关系一般是平等的、关联可以是单向、双向的；表现在代码层面，为被关联类B以类属性的形式出现在关联类A中，也可能是关联类A引用了一个类型为被关联类B的全局变量；

![img](http://www.uml.org.cn/oobject/images/940065f4.jpg)

![img](http://my.csdn.net/uploads/201206/07/1339064197_2222.jpg)

其中，关联两边的"employee"和“employer”标示了两者之间的关系，而数字表示两者的关系的限制，是关联两者之间的多重性。通常有“*”（表示所有，不限），“1”（表示有且仅有一个），“0...”（表示0个或者多个），“0，1”（表示0个或者一个），“n...m”(表示n到m个都可以),“m...*”（表示至少m个）。

+ 关联关系(Association) 是类与类之间最常用的一种关系，它是一种结构化关系，用于表示一类对象与另一类对象之间有联系。
+ 在UML类图中，用实线连接有关联的对象所对应的类，在使用Java、C#和C++等编程语言实现关联关系时，通常将一个类的对象作为另一个类的属性。
+ 在使用类图表示关联关系时可以在关联线上标注角色名。

### 双向关联

> 默认情况下，关联是双向的

![img](http://my.csdn.net/uploads/201206/07/1339064456_6833.png)

```java
public class Customer  
{  
    private Product[] products;  
    ……  
}  
public class Product  
{  
    private Customer customer;  
    ……  
}  
```

### 单向关联

> 类的关联关系也可以是单向的，单向关联用带箭头的实线表示

![img](http://my.csdn.net/uploads/201206/07/1339064543_2384.png)

```java
public class Customer  
{  
    private Address address;  
    ……  
}  
  
public class Address  
{  
    ……  
}  
```

### 自关联

> 在系统中可能会存在一些类的属性对象类型为该类本身，这种特殊的关联关系成为自关联

![img](http://my.csdn.net/uploads/201206/07/1339064668_4517.png)

```
public class Node  
{  
    private Node subNode;  
    ……  
}   
```

### 重数性关联

> 重数性关联关系又称为多重性关联关系(Multiplicity)，表示一个类的对象与另一个类的对象连接的个数。在UML中多重性关系可以直接在关联直线上增加一个数字表示与之对应的另一个类的对象的个数。

| 表示方式 | 多重性说明                              |
| ---- | ---------------------------------- |
| 1..1 | 表示另一个类的一个对象只与一个该类对象有关系             |
| 0..* | 表示另一个类的一个对象与零个或多个该类对象有关系           |
| 1..* | 表示另一个类的一个对象与一个或多个该类对象有关系           |
| 0..1 | 表示另一个类的一个对象没有或只与一个该类对象有关系          |
| m..n | 表示另一个类的一个对象与最少m、最多n个该类对象有关系 (m<=n) |

![img](http://my.csdn.net/uploads/201206/07/1339064814_8559.png)

```
{  
    private Button buttons[];  
    ……  
}   
public class Button  
{  
    …  
}  
```



### 聚合关系(Aggregation)

> 表示的是整体和部分的关系，整体和部分可以分开

+ 表示has-a的关系，是一种不稳定的包含关系。较强于一般关联，有整体与局部的关系，并且没有了整体，局部也可独立存在。
+ 通常在定义一个整体类后，再去分析这个整体类的组成结构，从而找出一些成员类，该整体类和成员类之间就形成了聚合关系。
+ 在聚合关系中，成员类是整体类的一部分，即成员对象是整体对象的一部分，但是成员对象可以脱离整体对象独立存在。在UML中，聚合关系用带空心菱形的直线表示。 

![img](http://my.csdn.net/uploads/201206/07/1339065043_2919.png)

```java
public class Car  
{  
    private Engine engine;  
    public Car(Engine engine)  
   {  
        this.engine = engine;  
    }  
      
    public void setEngine(Engine engine)  
    {  
        this.engine = engine;  
    }  
    ……  
}  
public class Engine  
{  
    ……  
}  
```

> 如：电话机包括一个话筒；电脑包括键盘、显示器，一台电脑可以和多个键盘、多个显示器搭配，确定键盘和显示器是可以和主机分开的，主机可以选择其他的键盘、显示器组成电脑；

![img](http://my.csdn.net/uploads/201206/07/1339065099_3986.jpg)



## 组合关系(Composition)

> 也是整体与部分的关系，但是整体与部分不可以分开

+ 组合关系(Composition)也表示类之间整体和部分的关系，但是组合关系中部分和整体具有**统一的生存期**。一旦整体对象不存在，部分对象也将不存在，部分对象与整体对象之间具有**同生共死**的关系。
+ 在组合关系中，成员类是整体类的一部分，而且整体类可以控制成员类的生命周期，即成员类的存在依赖于整体类。**在UML中，组合关系用带实心菱形的直线表示**。

![img](http://my.csdn.net/uploads/201206/07/1339065205_1491.png)

```java
public class Head  
{  
    private Mouth mouth;  
    public Head()  
    {  
    mouth = new Mouth();  
    }  
    ……  
}  
  
public class Mouth  
{  
    ……  
}  
```

如：公司和部门，部门是部分，公司是整体，公司A的财务部不可能和公司B的财务部对换，就是说，公司A不能和自己的财务部分开； 人与人的心脏.

![img](http://my.csdn.net/uploads/201206/07/1339065249_7771.jpg)



