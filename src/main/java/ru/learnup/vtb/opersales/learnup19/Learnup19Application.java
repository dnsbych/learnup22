package ru.learnup.vtb.opersales.learnup19;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.learnup.vtb.opersales.learnup19.model.Event;
import ru.learnup.vtb.opersales.learnup19.model.Ticket;
import ru.learnup.vtb.opersales.learnup19.services.OperSales;
import ru.learnup.vtb.opersales.learnup19.services.TicketService;

import java.util.List;

@SpringBootApplication
public class Learnup19Application {

    public static void main(String[] args) {
        final ConfigurableApplicationContext ctx = SpringApplication.run(Learnup19Application.class, args);

        //((OperSales) ctx.getBean("operSales")).addEvent("Новое мероприятие");

        ctx.getBean(TicketService.class).byTicket(new Ticket(1, 100, "Тестовое мероприятие"));
        ctx.getBean(OperSales.class).addEvent(new Event("Новое мероприятие"));
        ctx.getBean(OperSales.class).editEvent(new Event("Тетовое мероприятие"));

    }

}
