package filter;

import javabean.admin;
import javabean.userhome;
import javabean.JDBC;
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

@WebFilter(filterName = "userfilter",urlPatterns = {"/production/student.jsp"})
public class userfilter extends HttpFilter {
    private FilterConfig config;

    @Override
    public void init( FilterConfig config) throws ServletException {
        this.config = config;
    }

    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpSession session = request.getSession(true);
        if(session.getAttribute("user")==null ){
            session.setAttribute("success",3);
            response.sendRedirect("login.jsp");
        }else {
            chain.doFilter(request,response);
        }
    }
}
