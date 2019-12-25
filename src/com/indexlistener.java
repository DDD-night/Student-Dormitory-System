package com;

import javabean.JDBC;
import javabean.admin;
import javabean.userhome;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.ArrayList;

public class indexlistener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {

    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        HttpServletRequest request = (HttpServletRequest) sre.getServletRequest();
        if (request.getRequestURI().endsWith("index.jsp")){
            JDBC jdbc = null;
            HttpSession session = request.getSession(true);
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
        }
    }
}
