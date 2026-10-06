package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req,
                          HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();

        out.println("<html><body>");

        out.println("<h1>Hello from HelloServlet!</h1>");

        out.println("<p>Welcome to your first Tomcat web app.</p>");

        out.println("<a href='" + req.getContextPath()
                + "/'>Back to home</a>");

        out.println("</body></html>");
    }
}