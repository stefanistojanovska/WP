package mk.finki.ukim.wp.lab.web.rest;

import mk.finki.ukim.wp.lab.exceptions.DuplicateNameException;
import mk.finki.ukim.wp.lab.exceptions.MoreThanThreeSpicyIngredients;
import mk.finki.ukim.wp.lab.model.Ingredient;
import mk.finki.ukim.wp.lab.model.Pizza;
import mk.finki.ukim.wp.lab.service.IngredientService;
import mk.finki.ukim.wp.lab.service.PizzaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;
@Transactional
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class IngredientsRestfulResource {
    private IngredientService ingredientService;
    private PizzaService pizzaService;

    public IngredientsRestfulResource(IngredientService ingredientService,PizzaService pizzaService) {
        this.ingredientService = ingredientService;
        this.pizzaService=pizzaService;
    }

    @PostMapping("/ingredients")
    @ResponseStatus(HttpStatus.CREATED)
   // public Ingredient createIngredient(@RequestBody Ingredient ingredient) {
    public Ingredient createIngredient( @RequestParam("name") String name,
                                       @RequestParam("spicy") boolean boolSpicy,
                                       @RequestParam("amount") float amount,
                                       @RequestParam("veggie") boolean boolVeggie) throws DuplicateNameException, MoreThanThreeSpicyIngredients {
        Ingredient ingredient=new Ingredient(name,boolSpicy,amount,boolVeggie);
       /* boolean veggie=boolVeggie.equals("true");
        boolean spicy= boolSpicy.equals("true");


        //Ingredient result = ingredientService.createIngredient(id,name,spicy,amount,veggie);
        //response.setHeader("Location", builder.path("/ingredients/{id}").buildAndExpand(result.getSlotId()).toUriString());
        Ingredient in=null;
        in.setId(Id);
        in.setAmount(amount);
        in.setName(name);
        in.setSpicy(spicy);
        in.setVeggie(veggie);

        try {
            ingredientService.createIngredient(in);
        } catch (MoreThanThreeSpicyIngredients | DuplicateNameException moreThanThreeSpicyIngredients) {
            moreThanThreeSpicyIngredients.printStackTrace();
        }
        return in;*/

            return ingredientService.createIngredient(ingredient);

        //return null;
    }

    @PatchMapping("ingredients/{id}")
    public Ingredient updateSlot(@PathVariable("id") Long Id, @RequestParam("name") String name,
                                 @RequestParam("spicy") String boolSpicy,
                                 @RequestParam("amount") Float amount,
                                 @RequestParam("veggie") String boolVeggie) throws MoreThanThreeSpicyIngredients {

        boolean veggie=boolVeggie.equals("true");
        boolean spicy= boolSpicy.equals("true");
        Ingredient result=null;
        //if(ingredientService.countBySpicy()<3)  throw new MoreThanThreeSpicyIngredients();
            ingredientService.updateIngredient(Id,name,spicy,amount,veggie);

        return result;
    }
    @GetMapping("/ingredients")
    public List<Ingredient> getAll()
    {
        List<Ingredient> ingredients;
        ingredients=ingredientService.findAll();
        return ingredients.stream().sorted().collect(Collectors.toList());
    }
    @GetMapping("/ingredients/{id}")
    public Ingredient getIngredient(@PathVariable("id")Long id)
    {
        return ingredientService.getById(id);
    }

    @GetMapping("/ingredients&spicy=true")
    public List<Ingredient> getSpicy()
    {
        return ingredientService.getSpicy();
    }


    @DeleteMapping("/ingredients/{id}")
    public void delete(@PathVariable Long id) {
        ingredientService.deleteById(id);
    }

    @GetMapping("/ingredients/{id}/pizzas")
    public List<Pizza> getByIngredient(@PathVariable("id") Long id )
    {
        return pizzaService.getByIngredients(id);
    }





}
