package mk.finki.ukim.wp.lab.service.impl;

import mk.finki.ukim.wp.lab.model.Pizza;
import mk.finki.ukim.wp.lab.repository.PizzaRepository;
import mk.finki.ukim.wp.lab.repository.persistence.PersistentPizzaRepository;
import mk.finki.ukim.wp.lab.service.PizzaService;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.util.List;
@Service

public class PizzaServiceImpl implements PizzaService {
    private PersistentPizzaRepository pizzaRepository; //DEPENDENCY INJECTION

    public PizzaServiceImpl(PersistentPizzaRepository pizzaRepository) {

        this.pizzaRepository = pizzaRepository;
    }

    @Override
    public List<Pizza> listPizzas() {
        return null;
    }

    @Override
    public List<Pizza> getByIngredients(Long id) {
        return pizzaRepository.getAllByIngredients(id);
    }

    @Override
    public void delete(Long id) {
        pizzaRepository.deleteById(id);
    }

    @Override
    public List<Pizza> findAll() {
        return  pizzaRepository.findAll();
    }

    @Override
    public Pizza findById(Long id) {
        return pizzaRepository.findById(id);
    }

}
