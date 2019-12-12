package mk.finki.ukim.wp.lab.web;

import mk.finki.ukim.wp.lab.model.Order;
import mk.finki.ukim.wp.lab.service.OrderService;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.spring5.SpringTemplateEngine;import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/ConfirmationInfo.do")
public class ConfirmationInfo extends HttpServlet {
    private OrderService orderService;
    private SpringTemplateEngine springTemplateEngine;

    public ConfirmationInfo(OrderService orderService, SpringTemplateEngine springTemplateEngine) {
        this.orderService = orderService;
        this.springTemplateEngine = springTemplateEngine;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
      /*  System.out.println("[WP-Log] {doPost/Confirmation}");
        doGet(req,resp);*/
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
      /*  System.out.println("[WP-Log] {doGet/Confirmation}");
        if(req.getParameter("clientName")==null||req.getParameter("clientAddress")==null)
            resp.sendRedirect("/");
        Order order=(Order)req.getSession().getAttribute("order");
        order.setClientName(req.getParameter("clientName"));
        order.setClientAddress(req.getParameter("clientAddress"));
        orderService.placeOrder(order.getPizzaType(),order.getPizzaSize(),order.getClientName(),order.getClientAddress());
        req.getSession().removeAttribute("order");
        req.getSession().setAttribute("order",order);
        String ip=req.getRemoteHost();
        String browser=req.getHeader("User-Agent");
        WebContext webContext = new WebContext(req, resp, req.getServletContext());
        webContext.setVariable("ip",ip);
        webContext.setVariable("browser",browser);
        resp.setContentType("text/html; charset=UTF-8");
        this.springTemplateEngine.process("confirmationInfo.html", webContext, resp.getWriter());*/
    }
}
