package bean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
@WebServlet("/sesison/bind")
public class ListenerTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        //两个对象
        User user=new User("张三","123");
        User1 user1=new User1("李四","456");
        //将两个对象都存储到session域中
        session.setAttribute("user",user);
        session.setAttribute("user1",user1);
        session.removeAttribute("user");
    }
}
