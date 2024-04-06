package com.liruiyang.week5.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    
    Connection con = null;

    @Override
    public void init() throws ServletException {
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url = "jdbc:sqlserver://localhost;databaseName=userdb";
        String username = "sa";
        String password = "admin123456789";
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String str = "select * from usertable";
        try {
            ResultSet rs = con.createStatement().executeQuery(str);
            PrintWriter writer = response.getWriter();
            while(rs.next()){
                String username = rs.getString("username");
                String password = rs.getString("password");
                String user = "LiRuiyang";
                if (username.equals(user)){
                    writer.println("<h1>" + "Login Success !!!" + "</h1>");
                    writer.println("<h1>" + "Welcome," + user + "</h1>");
                }else {
                    writer.println("Username Or Password Error");
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    public void destroy() {
        try {
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

