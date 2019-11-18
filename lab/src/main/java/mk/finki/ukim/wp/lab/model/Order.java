package mk.finki.ukim.wp.lab.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order {
    private String pizzaType;
    private String pizzaSize;
    private String clientName;
    private String clientAddress;
    private Long orderId;
    private static Long counter;
    public Order(String pizzaType, String pizzaSize,String clientName, String clientAddress) {
        if(counter==null)
            counter=0L;
        this.pizzaSize=pizzaSize;
        this.pizzaType = pizzaType;
        this.clientName = clientName;
        this.clientAddress = clientAddress;
        this.orderId=++counter;

    }
}
