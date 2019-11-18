package mk.finki.ukim.wp.lab.web;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/logout")
public class LogoutServlet extends HttpServlet {

    /*
     * We use the service method since it is invoked for all HTTP methods
     */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("[WP-Log] {service/logout}");
        req.getSession().invalidate();
        resp.sendRedirect("/");
    }
}
