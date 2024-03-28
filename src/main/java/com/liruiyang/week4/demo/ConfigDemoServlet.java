package com.liruiyang.week4.demo;

import javax.servlet.*;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(
//        urlPatterns = {"/config"},
//        initParams = {
//                @WebInitParam(name = "name", value = "LiRuiyang"),
//                @WebInitParam(name = "studentid", value = "2022211001000411"),
//        },loadOnStartup = 1
//)

public class ConfigDemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletConfig config = getServletConfig();
        String name = config.getInitParameter("name");
        String studentid = config.getInitParameter("studentid");
        PrintWriter writer = response.getWriter();
//        writer.println("Task 2-Get init parameters from @WebServlet");
        writer.println("Task 1-Get init parameters from web.xml");
        writer.println("name " + name);
        writer.println("studentid " + studentid);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
