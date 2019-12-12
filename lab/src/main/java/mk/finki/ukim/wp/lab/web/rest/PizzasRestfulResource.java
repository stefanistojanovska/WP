package mk.finki.ukim.wp.lab.web.rest;

import mk.finki.ukim.wp.lab.model.Pizza;
import mk.finki.ukim.wp.lab.service.PizzaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PizzasRestfulResource {
    private PizzaService pizzaService;

    public PizzasRestfulResource(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }
    @DeleteMapping("/pizza/{id}")
    public void deletePizza(@PathVariable Long id) {
        pizzaService.delete(id);
    }
    @GetMapping("/pizzas")
    public List<Pizza> listAll()
    {
        return pizzaService.findAll();
    }
    @GetMapping("/pizza/{id}")
    public Pizza getById(@PathVariable("id")Long id)
    {
        return pizzaService.findById(id);
    }
    @GetMapping("/pizzas")
    public List<Pizza> getByIngredientsCount(@RequestParam("totalIngredients")int total)
    {
        return null;
    }
}
