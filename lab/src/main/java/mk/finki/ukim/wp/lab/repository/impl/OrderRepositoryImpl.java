package mk.finki.ukim.wp.lab.repository.impl;

import mk.finki.ukim.wp.lab.inmemory.DataHolder;
import mk.finki.ukim.wp.lab.model.Order;
import mk.finki.ukim.wp.lab.model.Pizza;
import mk.finki.ukim.wp.lab.repository.OrderRepository;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepositoryImpl implements OrderRepository {




    @Override
    public Order placeOrder(String pizzaType, String pizzaSize, String clientName, String address) {
        return null;
    }
}
