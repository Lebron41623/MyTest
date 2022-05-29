package com.bjpowernode.javaweb.servlet;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener
public class SessionAttributeListener implements HttpSessionAttributeListener {
    @Override
    public void attributeAdded(HttpSessionBindingEvent se) {
        //System.out.println("session data add");
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent se) {
        //System.out.println("session data remove");
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent se) {
        //System.out.println("session data repalced");
    }
}
