package by.tms.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/Hello")
public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String num1 = req.getParameter("num1");
        String num2 = req.getParameter("num2");
        String operation = req.getParameter("operation");
        int result = Calculator.calculator(Integer.parseInt(num1), Integer.parseInt(num2),operation);
        resp.getWriter().println("Result= " + result);

//        String name = req.getParameter("name");
//        String age = req.getParameter("age");
//        resp.getWriter().println("hi" + " " + name + " " + age);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String token = req.getHeader("token");
//        System.out.println(token);
//        String name = req.getParameter("name");
//        String age = req.getParameter("age");
//        resp.getWriter().println("hi" + " " + name + " " + age);
    }
}
