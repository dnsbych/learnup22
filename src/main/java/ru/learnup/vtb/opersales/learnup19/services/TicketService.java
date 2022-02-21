package ru.learnup.vtb.opersales.learnup19.services;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;
import ru.learnup.vtb.opersales.learnup19.annotations.Notifiable;
import ru.learnup.vtb.opersales.learnup19.events.BuyEvent;
import ru.learnup.vtb.opersales.learnup19.model.Ticket;
import ru.learnup.vtb.opersales.learnup19.services.interfaces.Logger;

@Service
@Data
@AllArgsConstructor
public class TicketService implements ApplicationContextAware {

    Logger logger;
    ApplicationContext ctx;

    @Notifiable
    public int byTicket(Ticket t) {
        //logger.print("Купили билет");

        //ctx.publishEvent(new BuyEvent(t));

        return 0;
    }

    public boolean returnTicket() {
        return true;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ctx = applicationContext;
    }
}
