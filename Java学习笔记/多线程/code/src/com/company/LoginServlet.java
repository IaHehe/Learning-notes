package com.company;

/**
 * Created by 1 on 2017/4/22.
 */
//模拟一个Servlet组件
public class LoginServlet {
    private static String usernameRef;
    private static String passwordRef;
    synchronized public static void doPost(String username, String password){
        try{
            usernameRef = username;
            if (username.equals("a")){
                Thread.sleep(5000);
            }
            passwordRef = password;
            System.out.println("username= "+usernameRef+" password= "+passwordRef);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
