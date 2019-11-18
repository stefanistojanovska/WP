package mk.finki.ukim.wp.lab.repository.impl;

import mk.finki.ukim.wp.lab.inmemory.DataHolder;
import mk.finki.ukim.wp.lab.model.Pizza;
import mk.finki.ukim.wp.lab.repository.PizzaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public class PizzaRepositoryImpl implements PizzaRepository {

    @Override
    public List<Pizza> getAllPizzas() {
        return DataHolder.getPizzaList();
    }
}
