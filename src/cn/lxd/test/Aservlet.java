package cn.lxd.test;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Aservlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        System.out.println("Afilter....");
    }


}
