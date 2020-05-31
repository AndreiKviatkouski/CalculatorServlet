package servletWeb;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "TestFilter", servletNames = {"AuthUserServlet","LogoutServlet"})
public class FilterHistory extends HttpFilter {
    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        if (req.getSession().getAttribute("currentUser")!= null) {
            chain.doFilter(req, res);
        }else{
            res.getWriter().println("You are not registered or logged in!");
            res.sendRedirect("/main");
        }
    }
}
