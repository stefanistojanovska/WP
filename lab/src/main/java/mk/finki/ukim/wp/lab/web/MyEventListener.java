package mk.finki.ukim.wp.lab.web;
import org.springframework.stereotype.Component;
import org.springframework.context.event.EventListener;
import org.springframework.web.context.support.RequestHandledEvent;

@Component
public class MyEventListener {
    @EventListener(RequestHandledEvent.class)
    public void handleEvent (RequestHandledEvent e) {
      /*  System.out.println("[WP-Log] {EventListener}");
        System.out.println("-- RequestHandledEvent --");
        System.out.println(e);*/
    }
}
/*
@Component
public class EventListener implements ApplicationListener<CustomSpringEvent> {
    @Override
    public void onApplicationEvent(CustomSpringEvent event) {
        System.out.println("Received spring custom event - " + event.getMessage());
    }
}*/
