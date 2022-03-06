package ru.learnup.vtb.opersales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.learnup.vtb.opersales.model.Event;
import ru.learnup.vtb.opersales.model.Ticket;
import ru.learnup.vtb.opersales.services.OperaSales;
import ru.learnup.vtb.opersales.services.TicketService;

@SpringBootApplication
public class OperaSalesApplication {

    public static void main(String[] args) {
        final ConfigurableApplicationContext ctx = SpringApplication.run(OperaSalesApplication.class, args);

        //((OperSales) ctx.getBean("operSales")).addEvent("Новое мероприятие");

        ctx.getBean(TicketService.class).byTicket(new Ticket(1, 100, "Тестовое мероприятие"));
        ctx.getBean(OperaSales.class).addEvent(new Event("Новое мероприятие"));
        ctx.getBean(OperaSales.class).editEvent(new Event("Тетовое мероприятие"));

    }

}
