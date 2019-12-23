package servlet;

import com.sun.net.httpserver.HttpsServer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import javabean.JDBC;
import javabean.admin;
import javabean.user;

@WebServlet(name = "registerservlet", urlPatterns = "/production/register")
public class registerservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("UTF-8");
        int student =0;
        student += Integer.parseInt(req.getParameter("student"));
        String number = req.getParameter("number");
        String name=req.getParameter("name");
        String home=req.getParameter("home");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        if (student==1) {
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
                    resp.sendRedirect("page_404.html");
                } else {
                    resp.sendRedirect("login.jsp");
                }
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }else {
            admin admin1 = new admin();
            admin1.setAdminnumber(number);
            admin1.setAdminname(name);
            admin1.setAdminhome(home);
            admin1.setAdminemail(email);
            admin1.setAdminpassword(password);
            try {
                JDBC jdbc = new JDBC();
                int i = jdbc.insertadmin(admin1);
                if (i == 0) {
                    resp.sendRedirect("page_404.html");
                } else {
                    resp.sendRedirect("login.jsp");
                }
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
