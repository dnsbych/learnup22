package ru.learnup.vtb.opersales.learnup19.services;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import ru.learnup.vtb.opersales.learnup19.events.BuyEvent;
import ru.learnup.vtb.opersales.learnup19.model.Ticket;

@Component
public class EmailNotifier implements ApplicationListener<BuyEvent> {

    @Override
    public void onApplicationEvent(BuyEvent event) {
        Ticket ev = (Ticket) event.getSource();
        System.out.println("Купили билет на " + ev.getEventName());
    }
}
