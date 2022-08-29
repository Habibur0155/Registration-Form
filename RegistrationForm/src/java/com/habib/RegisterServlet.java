
package com.habib;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class RegisterServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
        
        out.println("<h2>Welcome to Registerccc Servlet</h2>");
        String name = request.getParameter("user_name");
        String password = request.getParameter("user_password");
        String email = request.getParameter("user_email");
        String gender = request.getParameter("user_gender");
        String course = request.getParameter("user_course");
        
        String condition = request.getParameter("checked");
        
         out.println("Last");
        if (true) {
            out.println("<h2>" + name + " </h2>");
            out.println("<h2>" + password + " </h2>");
            out.println("<h2>" + email + " </h2>");
            out.println("<h2>" + gender + " </h2>");
            out.println("<h2>" + course + " </h2>");
        } else {
            out.print("<h2>You have not accepted terms and conditions</h2>");
        }
      
    }
}
