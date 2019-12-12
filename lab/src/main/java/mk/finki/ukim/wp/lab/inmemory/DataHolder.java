package mk.finki.ukim.wp.lab.inmemory;

import lombok.Getter;
import mk.finki.ukim.wp.lab.model.Order;
import mk.finki.ukim.wp.lab.model.Pizza;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


@Component

public class DataHolder {
    @Getter
    private static List<Pizza> pizzaList=new ArrayList<>();
    @Getter
    private static  List<Order> orderList=new ArrayList<>();
    @PostConstruct
    public void init()
    {
       // pizzaList.add(new Pizza("Capri","Mnogu ubava"));
      //  pizzaList.add(new Pizza("Margarita","Mnogu dobra"));
       // pizzaList.add(new Pizza("Makedonska","Sarena mnogu"));
       // pizzaList.add(new Pizza("Grcka","Solena mnogu"));
       // pizzaList.add(new Pizza("SevernoMakedonska","PrespanskiZacin"));
       // pizzaList.add(new Pizza("Egejska","KakvaEtakvaE"));
       // pizzaList.add(new Pizza("Italliana","Evropska"));
       // pizzaList.add(new Pizza("Americana","NemaSoNema"));
       // pizzaList.add(new Pizza("Stipska","Fina"));
        //pizzaList.add(new Pizza("Gevgeliska","isto fina"));

    }

}
