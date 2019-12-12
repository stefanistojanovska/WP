package mk.finki.ukim.wp.lab.service;

import mk.finki.ukim.wp.lab.exceptions.DuplicateNameException;
import mk.finki.ukim.wp.lab.exceptions.MoreThanThreeSpicyIngredients;
import mk.finki.ukim.wp.lab.model.Ingredient;

import java.util.List;

public interface IngredientService {
    Ingredient createIngredient(Ingredient ingredient) throws MoreThanThreeSpicyIngredients, DuplicateNameException;
    Ingredient updateIngredient(Long id,String name,boolean spicy,float amount,boolean veggie);
    List<Ingredient> findAll();
    Ingredient getById(Long id);
    List<Ingredient> getSpicy();
    Integer countBySpicy();
    void deleteById(Long id);
}
