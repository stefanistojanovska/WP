package mk.finki.ukim.wp.lab.service;

import mk.finki.ukim.wp.lab.model.Pizza;

import java.util.List;

public interface PizzaService {
    List<Pizza> listPizzas();
    List<Pizza> getByIngredients(Long id);
    void delete(Long id);
    List<Pizza> findAll();
    Pizza findById(Long id);
}
