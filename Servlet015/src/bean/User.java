package bean;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class User implements HttpSessionBindingListener {
    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println("User对象绑定到session域中了");
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        System.out.println("User对象从session域中取出了");
    }

    private  String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
