package mk.finki.ukim.wp.lab.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity
@Table(name="ingredients")
public class Ingredient implements Comparable<Ingredient> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private boolean spicy;
    private float amount;
    private boolean veggie;

    public Ingredient(Long id,String name,boolean spicy,float amount,boolean veggie) {
        this.id=id;
        this.name=name;
        this.spicy=spicy;
        this.amount=amount;
        this.veggie=veggie;
    }

    public String getName() {
        return name;
    }

    public boolean isSpicy() {
        return spicy;
    }

    public float getAmount() {
        return amount;
    }

    public boolean isVeggie() {
        return veggie;
    }

    @Override
    public int compareTo(Ingredient o) {
        return this.name.compareTo(o.name);
    }
}
