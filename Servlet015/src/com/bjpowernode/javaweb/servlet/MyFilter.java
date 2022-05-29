package com.bjpowernode.javaweb.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(value = "/my.jsp",dispatcherTypes = DispatcherType.FORWARD)
public class MyFilter implements Filter {
    public MyFilter() {
      //  System.out.println("无参构造方法执行");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
       // System.out.println("init方法执行");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain Chain)
            throws IOException, ServletException {
        System.out.println("doFilter方法执行");
        PrintWriter out = response.getWriter();
        out.print("hello Filter;");
    }

    @Override
    public void destroy() {
     //   System.out.println("destory方法执行");
    }
}
