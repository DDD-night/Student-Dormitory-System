package filter;

import javabean.JDBC;
import javabean.admin;
import javabean.userhome;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@WebFilter(filterName = "loginfilter",urlPatterns = {"/production/index.jsp"})
public class adminfilter extends HttpFilter {
    private FilterConfig config;

    @Override
    public void init( FilterConfig config) throws ServletException {
        this.config = config;
    }

    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpSession session = request.getSession(true);
        if(session.getAttribute("admin")==null ){
            session.setAttribute("success", 3);
            response.sendRedirect("login.jsp");
        }else {
            JDBC jdbc = null;
            ArrayList<userhome> userhomes = new ArrayList<>();
            admin admin_result = (admin) session.getAttribute("admin");
            try {
                jdbc = new JDBC();
                userhomes=jdbc.selectuserhome(admin_result.getAdminhome());
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            int x1=0,x2=0,x3=0;
            for (int i=0; i<userhomes.size(); i++){
                if (userhomes.get(i).getThing()==1){
                    x1++;
                }else if (userhomes.get(i).getThing()==2){
                    x2++;
                }else {
                    x3++;
                }
            }
            session.setAttribute("x1",x1);
            session.setAttribute("x2",x2);
            session.setAttribute("x3",x3);
            session.setAttribute("userhomes",userhomes);
            session.setAttribute("admin",admin_result);
            chain.doFilter(request,response);
        }
    }
}
