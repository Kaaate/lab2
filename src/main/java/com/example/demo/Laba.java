package com.example.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "TaskOne", value = "/TaskOne")
public class Laba extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            double a, b, c, d, z = 0;
            a = Integer.parseInt(request.getParameter("n1"));
            b = Integer.parseInt(request.getParameter("n2"));
            c = Integer.parseInt(request.getParameter("n3"));
            d = Integer.parseInt(request.getParameter("n4"));
            String amal = request.getParameter("amal");

            if (amal.equals("first")) {
                z = Math.pow(a,b)/Math.sinh(Math.abs(b))+ 4*Math.log1p(c)/Math.pow(d,0.25);
            }
            if (amal.equals("second")) {
                z = 9*Math.asin(a)/Math.cos(Math.pow(Math.abs(b),0.5)) + Math.pow(2.43, d) + Math.log1p(c);
            }
            if (amal.equals("third")) {
                z = 6*Math.pow(Math.sin(Math.abs(2*a)),Math.log10(b)) + Math.pow(c*Math.cosh((-1)*d),0.5);
            }

            out.println("Result : " + z);
        }
        finally{
            out.close();
        }

    }
}
