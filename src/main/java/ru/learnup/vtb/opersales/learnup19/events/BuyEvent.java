package ru.learnup.vtb.opersales.learnup19.events;

import org.springframework.context.ApplicationEvent;
import ru.learnup.vtb.opersales.learnup19.model.Ticket;

public class BuyEvent extends ApplicationEvent {


    public BuyEvent(Ticket source) {
        super(source);
    }
}
