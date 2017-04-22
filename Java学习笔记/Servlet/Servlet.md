# Servlet

## 概念

Servlet是在服务器上运行的小程序。一个Servlet就是一个Java类，并且可以通过“请求-响应”编程模型来访问的这个驻留在服务器内存里的Servlet程序。



## 方法

Servlet接口中定义了以下五个方法

生命周期方法

+ void init(ServletConfig config) throws ServletException

  **Servelet第一次被请求时调用,之后不会被调用**

+ void service(ServletRequest request, ServletResponse response) throws ServletException,java.io.IOException

  **每次请求Servlet时，Servlet容器都会调用这个方法**

+ void destroy()

  **销毁Servlet时，Servlet容器调用**

  ---

  非生命周期方法

+ java.lang.String getServletInfo()

+ ServletConfig getServletConfig()

  ​


