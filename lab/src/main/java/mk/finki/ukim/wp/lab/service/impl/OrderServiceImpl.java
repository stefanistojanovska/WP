package mk.finki.ukim.wp.lab.service.impl;

import mk.finki.ukim.wp.lab.model.Order;
import mk.finki.ukim.wp.lab.repository.OrderRepository;
import mk.finki.ukim.wp.lab.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order placeOrder(String pizzaType,String pizzaSize,String clientName, String address) {
        return orderRepository.placeOrder(pizzaType,pizzaSize,clientName,address);
    }
}
