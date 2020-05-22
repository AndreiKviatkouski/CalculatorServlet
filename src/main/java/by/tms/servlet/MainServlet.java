package by.tms.servlet;

import org.w3c.dom.ls.LSOutput;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/main")
public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        if (session.getAttribute("currentUser") == null) {
            resp.getWriter().println("Access denied");
        } else {
            User currentUser = (User) session.getAttribute("currentUser");
            String num1 = req.getParameter("num1");
            String num2 = req.getParameter("num2");
            String operation = req.getParameter("operation");
            int resultOperation = Calculator.calculator(Integer.parseInt(num1), Integer.parseInt(num2), operation);
            resp.getWriter().println("Hi " + currentUser.getName() + "!" + "Yore result " + num1 + " " + operation + " " + num2 + " = " + resultOperation);
        }
    }
}