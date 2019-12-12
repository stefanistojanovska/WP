package mk.finki.ukim.wp.lab.repository.persistence;

import mk.finki.ukim.wp.lab.model.Ingredient;
import mk.finki.ukim.wp.lab.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersistentIngredientsRepository extends JpaRepository<Ingredient,String> {
   /* @Modifying
    @Query(
            value =
                    "insert into Infredients (name, spicy, amount, veggie) values (:name, :spicy, :amount, :veggie)",
            nativeQuery = true)
    void insertIngredient(String name,boolean spicy,float amount,boolean veggie);*/
    Ingredient save(Ingredient ingredient);
    List<Ingredient> findAll();
    Ingredient getById(Long id);

    List<Ingredient> findAllBySpicyIsTrue();
    Integer countAllBySpicyIsTrue();
    void deleteById(Long id);

}
