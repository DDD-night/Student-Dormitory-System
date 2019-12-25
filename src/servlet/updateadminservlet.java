package servlet;

import javabean.JDBC;
import javabean.user;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "updateadmin", urlPatterns = "/production/updateadmin")
public class updateadminservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("UTF-8");
        HttpSession session = req.getSession(true);
        String number = req.getParameter("number");
        String name=req.getParameter("name");
        String home=req.getParameter("home");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        user user1 = new user();
        user1.setNumber(number);
        user1.setName(name);
        user1.setHome(home);
        user1.setEmail(email);
        user1.setPassword(password);
        try {
            JDBC jdbc = new JDBC();
            int i = jdbc.insertuser(user1);
            if (i == 0) {
                session.setAttribute("success",4);
                resp.sendRedirect("login.jsp#signup");
            } else {
                session.setAttribute("success",5);
                resp.sendRedirect("login.jsp");
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            session.setAttribute("success",4);
            resp.sendRedirect("login.jsp#signup");
        }
    }
}
