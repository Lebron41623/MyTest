package com.bjpowernode.javaweb.servlet;


import javax.servlet.ServletRequestEvent;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServletRequestListener implements javax.servlet.ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("request对象被创建");

    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("request对象被销毁");
    }
}
