package mk.finki.ukim.wp.lab.service.impl;

import mk.finki.ukim.wp.lab.model.Pizza;
import mk.finki.ukim.wp.lab.repository.PizzaRepository;
import mk.finki.ukim.wp.lab.service.PizzaService;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.util.List;
@Service

public class PizzaServiceImpl implements PizzaService {
    private  PizzaRepository pizzaRepository; //DEPENDENCY INJECTION

    public PizzaServiceImpl(PizzaRepository pizzaRepository) {

        this.pizzaRepository = pizzaRepository;
    }

    @Override
    public List<Pizza> listPizzas() {

        return pizzaRepository.getAllPizzas();
    }
}
