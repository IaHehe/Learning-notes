# SQL基础

SQL是Structure Query Language(结构化查询语言)的缩写，是使用关系型数据库的应用语言。

SQL语句主要可以划分为以下3个类别：

1. DDL(Data Definition Language)语句：数据定义语言，这些语句定义了不同的数据段，数据库，表、列、索引等数据库对象。常用的语句关键字主要包括**create、drop、alter**(修改)等。
2. DML(Data Manipulation Language)语句：数据操纵语句，用于添加、删除、更新和查询数据库记录，并检查数据完整性。常用的语句关键字主要包括**insert、delete、update和select**等。
3. DCL(Data Control Language)语句：数据控制语句，用于控制不同数据段直接的许可和访问级别的语句。这些语句定义了数据库、表、字段、用于的访问权限和安全级别。主要的语句关键字包括grant、revoke等。



## DDL语句

DDL语句和DML语句最大区别在于DML只对表内部数据操作，而不设计表的定义、结构的修改，更不会涉及其他对象。DDL一般由数据库管理员(DBA)使用，开发人员一般很少使用。



### 1.创建数据库

```sql
create database dbname;
```

查询数据库`show databases;`

选择数据库`use dbname;`



### 2.删除数据库

```
drop database dbname;
```



### 3.创建表

```sql
create table tablename(
column_name_1 column_type_1 constraints(约束条件),
column_name_2 column_type_2 constraints,
...
)
```

表创建完成后，如果需要查看一下表的定义，使用`desc tablename;`

为了得到更全面的表定义信息，可以使用`show create table tablename \G;`可以看到表的engine(存储引擎)和charset(字符集)等信息。"\G"的意思是使记录能够按字段竖向排列，以便显示内容较长的记录。



### 4.删除表

```sql
drop table tablename;
```



### 5.修改表

对于已经创建好的表，尤其是已经有大量数据的表，如果需要做一些结构上的改变，可以先将表删除，然后再按照新的表定义重建表。由于需要额外进行数据重新加载的工作，故表结构的更改都使用`alter table`语句。

1. 修改表类型，语法如下:

   `ALTER TABLE tablename MODIFY[COLUMN]column_definition[first|AFTER col_name]`

   例如，修改表emp的ename字段定义，将varchar(10)改为varchar(20)

   `alter temp modify ename varchar(20)`

   ​

2. 增加表字段，语法如下：

   `ALTER TABLE tablename ADD [COLUMN] column_definition [FIRST|AFTER col_name]`

   例如，在表emp中新增加字段age，类型为int(3):`alter table emp add column age int(3)`



3. 删除表字段，语法如下：

   `ALTER TABLE tablename DROP [COLUMN] col_name`

   例如，将字段age删除掉:`alter table emp drop column age;`

   ​


4. 字段改名，语法如下：

   `ALTER TABLE tablename CHANGE [COLUMN] old_col_name column_definition [FIRST|AFTER col_name]`

   例如，将age改名为age1，同时修改字段类型为int(4)：`alter table emp change age ag1 int(4)`

> change和modify都可以修改表的定义，不同的是change后面需要写两次列名，不方便。但是change的优点是可以修改名称，modify则不能。



5. 修改字段排列顺序

   > 前面介绍的字段增加和修改语法(ADD/CHANGE/MODIFY)中，都有一个可选项first/after column_name，这个选项可以用来修改字段在表中的位置，ADD增加的新字段默认是加在表的最后位置，而CHANGE/MODIFY默认都不会改变字段的位置。

   例如，将新增的字段birth date加在ename之后：`alter table emp birth add date after enames;`

   修改字段age，将它放在最前面：`alter table empmodify age int(3) first;`



6. 更改表名，语法如下：

   `ALTER TABLE tablename RENAME [TO] new_tablename;`