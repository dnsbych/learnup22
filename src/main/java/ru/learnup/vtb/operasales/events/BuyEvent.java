package ru.learnup.vtb.opersales.events;

import org.springframework.context.ApplicationEvent;
import ru.learnup.vtb.opersales.model.Ticket;

public class BuyEvent extends ApplicationEvent {


    public BuyEvent(Ticket source) {
        super(source);
    }
}
