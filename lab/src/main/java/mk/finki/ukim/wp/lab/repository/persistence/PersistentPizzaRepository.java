package mk.finki.ukim.wp.lab.repository.persistence;

import mk.finki.ukim.wp.lab.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersistentPizzaRepository extends JpaRepository<Pizza,String> {
    @Query("SELECT p FROM  Pizza p where p.ingredients=:id")
    List<Pizza> getAllByIngredients(Long id);

    void deleteById(Long id);
    List<Pizza> findAll();

    Pizza findById(Long id);
}
