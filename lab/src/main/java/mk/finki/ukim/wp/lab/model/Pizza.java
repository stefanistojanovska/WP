package mk.finki.ukim.wp.lab.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pizza {
    private String name;
    private String description;


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
