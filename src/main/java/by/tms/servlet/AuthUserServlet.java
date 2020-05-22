package by.tms.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/auth")
public class AuthUserServlet extends HttpServlet {
    private UserStorage userStorage = new UserStorage();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User userByLogin = userStorage.getUserByLogin(req.getParameter("login"));
        try {
            if (userByLogin.getLogin() == null || !userByLogin.getLogin().equals("login")) {
            }
        }catch (NullPointerException e){
            resp.getWriter().println("The user not found");
        }

        if (userByLogin.getPassword().equals(req.getParameter("password"))) {
            req.getSession().setAttribute("currentUser", userByLogin);
            resp.getWriter().println("Yor are authorized." + "Hi " + userByLogin.getName() + "!");
        } else {
            resp.getWriter().println("The password dont correct!");
        }
    }
}
