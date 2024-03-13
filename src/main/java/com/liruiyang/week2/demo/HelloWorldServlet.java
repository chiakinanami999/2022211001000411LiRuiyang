package com.liruiyang.week2.demo;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class HelloWorldServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        PrintWriter writer = response.getWriter();
        writer.println("Name : Li Ruiyang");
        writer.println("ID : 2022211001000411");
        Date current = new Date();
        writer.println("Date and Time : " + current.toString());
        writer.close();

    }
}
