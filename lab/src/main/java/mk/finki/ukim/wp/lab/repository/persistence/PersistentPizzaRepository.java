package mk.finki.ukim.wp.lab.repository.persistence;

import mk.finki.ukim.wp.lab.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersistentPizzaRepository extends JpaRepository<Pizza,String> {
    @Query("SELECT p FROM  Pizza p join p.ingredients i where i.id=:id")
    List<Pizza> getAllByIngredients(@Param("id") Long id);

    List<Pizza> findAllByIngredients_Id(Long id);


    void deleteById(Long id);
    List<Pizza> findAll();

    Pizza findById(Long id);
}
