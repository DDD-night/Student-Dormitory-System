package servlet;

import javabean.JDBC;
import javabean.admin;
import javabean.user;
import javabean.userhome;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet(name = "login",urlPatterns = "/production/login")
public class loginservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            req.setCharacterEncoding("utf-8");
            resp.setCharacterEncoding("UTF-8");
            HttpSession session = req.getSession(true);
            int student =0;
            String number = req.getParameter("number");
            String password =req.getParameter("password");
            student += Integer.parseInt(req.getParameter("student"));

            JDBC jdbc = new JDBC();
            if (student==1){
                user user1 = new user();
                user user_result = new user();
                user1.setNumber(number);
                user1.setPassword(password);
                user_result = jdbc.checkuser(user1);
                if (user_result==null){
                    session.setAttribute("success",2);
                    resp.sendRedirect("login.jsp");
                } else{
                    session.setAttribute("success",1);
                    session.setAttribute("user",user_result);
                    resp.sendRedirect("student.jsp");
                }
            }else{
                int x1=0,x2=0,x3=0;
                admin admin1 = new admin();
                admin admin_result = new admin();
                admin1.setAdminnumber(number);
                admin1.setAdminpassword(password);
                admin_result = jdbc.checkadmin(admin1);
                    if(admin_result==null){
                        session.setAttribute("success",2);
                        resp.sendRedirect("login.jsp");
                    }else{
                        ArrayList<userhome> userhomes=jdbc.selectuserhome(admin_result.getAdminhome());
                        for (int i=0;i<userhomes.size();i++){
                            if (userhomes.get(i).getThing()==1){
                                x1++;
                            }else if (userhomes.get(i).getThing()==2){
                                x2++;
                            }else {
                                x3++;
                            }
                        }
                        session.setAttribute("success",1);
                        session.setAttribute("x1",x1);
                        session.setAttribute("x2",x2);
                        session.setAttribute("x3",x3);
                        session.setAttribute("userhomes",userhomes);
                        session.setAttribute("admin",admin_result);
                        resp.sendRedirect("index.jsp");
//                        RequestDispatcher rd =req.getRequestDispatcher("index.jsp");
//                        rd.forward(req,resp);
                    }
            }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
