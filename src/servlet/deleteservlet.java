package servlet;

import javabean.JDBC;
import javabean.user;
import javabean.userhome;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "delete", urlPatterns = "/production/delete")
public class deleteservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("UTF-8");
        HttpSession session = req.getSession(true);
        String number=req.getParameter("number");
        String adminhome = req.getParameter("adminhome");
        userhome userhome1 = new userhome();
        userhome1.setNumber(number);
        userhome1.setAdminhome(adminhome);
        try {
            JDBC jdbc = new JDBC();
            int i = jdbc.deleteuserhome(userhome1);
            if (i == 0) {
                session.setAttribute("success",6);

            } else {
                session.setAttribute("success",7);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            session.setAttribute("success",6);
        }
        resp.sendRedirect("index.jsp");
    }
}
