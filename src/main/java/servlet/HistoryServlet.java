package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "history", urlPatterns = "/history")
public class HistoryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<String> all_operation = (List<String>) getServletContext().getAttribute("all operation");
        String operation = req.getParameter("operation");

        if ("sum".equals(operation)) {
            for (String str : all_operation) {
                if (str.contains("sum")) {
                    resp.getWriter().println(str);
                }
            }
        }
        if ("div".equals(operation)) {
            for (String str : all_operation) {
                if (str.contains("div")) {
                    resp.getWriter().println(str);
                }
            }
        }
        if ("minus".equals(operation)) {
            for (String str : all_operation) {
                if (str.contains("minus")) {
                    resp.getWriter().println(str);
                }
            }
        }
        if ("multiply".equals(operation)) {
            for (String str : all_operation) {
                if (str.contains("multiply")) {
                    resp.getWriter().println(str);
                }
            }
        }

        if ("clear".equals(operation)) {
            all_operation.clear();
            resp.getWriter().println("History is empty");
        }

        if ("showAll".equals(operation)) {
            resp.getWriter().println(all_operation);
        }

    }
}

