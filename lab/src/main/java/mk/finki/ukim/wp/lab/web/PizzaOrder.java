package mk.finki.ukim.wp.lab.web;

import mk.finki.ukim.wp.lab.model.Order;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.spring5.SpringTemplateEngine;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/PizzaOrder.do")
public class PizzaOrder extends HttpServlet {
    private final SpringTemplateEngine springTemplateEngine;
    public PizzaOrder( SpringTemplateEngine springTemplateEngine) {
        this.springTemplateEngine = springTemplateEngine;

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        /*System.out.println("[WP-Log] {doPost/PizzaOrder}");
        doGet(req,resp);
*/
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
       /* System.out.println("[WP-Log] {doGet/PizzaOrder");
        if(req.getParameter("pizza_size")==null)
            resp.sendRedirect("/");
        WebContext webContext = new WebContext(req, resp, req.getServletContext());
        HttpSession session=req.getSession();
        Order order=(Order)session.getAttribute("order");
        session.removeAttribute("order");
        order.setPizzaSize(req.getParameter("pizza_size"));
        session.setAttribute("order",order);
        resp.setContentType("text/html; charset=UTF-8");
        this.springTemplateEngine.process("deliveryInfo.html", webContext, resp.getWriter());*/

    }


}
