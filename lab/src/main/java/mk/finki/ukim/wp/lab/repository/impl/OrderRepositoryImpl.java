package mk.finki.ukim.wp.lab.repository.impl;

import mk.finki.ukim.wp.lab.inmemory.DataHolder;
import mk.finki.ukim.wp.lab.model.Order;
import mk.finki.ukim.wp.lab.repository.OrderRepository;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepositoryImpl implements OrderRepository {

    @Override
    public Order placeOrder(String pizzaType,String pizzaSize, String clientName, String address) {
        Order order=new Order(pizzaType,pizzaSize,clientName,address);
        DataHolder.getOrderList().add(order);
        return order;
    }


}
