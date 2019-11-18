package mk.finki.ukim.wp.lab.repository;

import mk.finki.ukim.wp.lab.model.Order;

public interface OrderRepository {
    Order placeOrder(String pizzaType,String pizzaSize, String clientName, String address);

}
