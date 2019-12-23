package mk.finki.ukim.wp.lab.service.impl;

import mk.finki.ukim.wp.lab.exceptions.DuplicateNameException;
import mk.finki.ukim.wp.lab.exceptions.MoreThanThreeSpicyIngredients;
import mk.finki.ukim.wp.lab.model.Ingredient;
import mk.finki.ukim.wp.lab.repository.persistence.PersistentIngredientsRepository;
import mk.finki.ukim.wp.lab.service.IngredientService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import javax.xml.ws.ServiceMode;
import java.util.List;

@Service

public class IngredientServiceImpl implements IngredientService {
    private PersistentIngredientsRepository rep;

    public IngredientServiceImpl(PersistentIngredientsRepository rep) {
        this.rep = rep;
    }

    @Override
    public Ingredient createIngredient(Ingredient ingredient) throws MoreThanThreeSpicyIngredients, DuplicateNameException {
       //Ingredient ingredient=new Ingredient(id,name,spicy,amount,veggie);
        if(rep.countAllBySpicyIsTrue()>3) throw new MoreThanThreeSpicyIngredients();
        String name=ingredient.getName();
        List<Ingredient> ingredients=rep.findAll();
        for(Ingredient i:ingredients)
            if(i.getName().equals(name)) throw new DuplicateNameException();
       return rep.save(ingredient);

    }

    @Override
    public Ingredient updateIngredient(Long id,String name, boolean spicy, float amount, boolean veggie) {
        Ingredient ingredient=new Ingredient(name,spicy,amount,veggie);
        return rep.save(ingredient);

    }

    @Override
    public List<Ingredient> findAll() {
        return rep.findAll();
    }

    @Override
    public Ingredient getById(Long id) {
        return rep.getById(id);
    }

    @Override
    public List<Ingredient> getSpicy() {
        return rep.findAllBySpicyIsTrue();
    }

    @Override
    public Integer countBySpicy() {
        return rep.countAllBySpicyIsTrue();
    }

    @Override
    public void deleteById(Long id) {
        rep.deleteById(id);
    }
}
