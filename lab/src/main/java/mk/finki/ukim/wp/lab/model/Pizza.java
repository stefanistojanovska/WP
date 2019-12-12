package mk.finki.ukim.wp.lab.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name="pizzas")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @ManyToMany
    @JoinTable(name = "pizza_ingredient",
            joinColumns = @JoinColumn(name = "pizza"),
            inverseJoinColumns = @JoinColumn(name = "ingredient"))
    private List<Ingredient> ingredients;
    private boolean veggie;

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public boolean isVeggie() {
        return veggie;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


}
