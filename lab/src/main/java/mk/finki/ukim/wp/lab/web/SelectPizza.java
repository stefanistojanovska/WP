
package mk.finki.ukim.wp.lab.web;

import mk.finki.ukim.wp.lab.model.Order;
import org.slf4j.LoggerFactory;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.spring5.SpringTemplateEngine;

import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.logging.Logger;

@WebServlet( urlPatterns = "/selectPizza.do")
public class SelectPizza extends HttpServlet {
    private final SpringTemplateEngine springTemplateEngine;

    public SelectPizza( SpringTemplateEngine springTemplateEngine) {
        this.springTemplateEngine = springTemplateEngine;

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("[WP-Log] {doPost/SeletPizza}");
        doGet(req,resp);
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("[WP-Log] {doGet/SelectPizza}");
        WebContext webContext = new WebContext(req, resp, req.getServletContext());
        if(req.getParameter("pizza")==null)
            resp.sendRedirect("/");
        Order order=new Order(req.getParameter("pizza"),"","","");
        HttpSession session=req.getSession();
        session.setAttribute("order", order);
        resp.setContentType("text/html; charset=UTF-8");
        this.springTemplateEngine.process("selectPizzaSize.html", webContext, resp.getWriter());

    }

}

