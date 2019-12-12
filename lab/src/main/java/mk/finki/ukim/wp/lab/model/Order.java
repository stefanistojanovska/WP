package mk.finki.ukim.wp.lab.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;

@Entity
@Table(name="orders")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    @ManyToOne
    private Pizza pizzaType;
    private String pizzaSize;
    private String clientName;
    private String clientAddress;

    //private static Long counter;
 /*   public Order(Pizza pizzaType, String pizzaSize,String clientName, String clientAddress) {
        if(counter==null)
            counter=0L;
        this.pizzaSize=pizzaSize;
        this.pizzaType = pizzaType;
        this.clientName = clientName;
        this.clientAddress = clientAddress;
        this.orderId=++counter;

    }*/
}
