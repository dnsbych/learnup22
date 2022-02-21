package ru.learnup.vtb.opersales.learnup19.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import ru.learnup.vtb.opersales.learnup19.annotations.Notifiable;
import ru.learnup.vtb.opersales.learnup19.model.Event;
import ru.learnup.vtb.opersales.learnup19.model.Ticket;
import ru.learnup.vtb.opersales.learnup19.services.interfaces.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class OperSales implements ApplicationContextAware {

    private Logger logger;
    private ApplicationContext ctx;

    @Autowired
    public OperSales(Logger logger) {
        this.logger = logger;
    }

    @Notifiable
    public Event addEvent(Event e) {
        //logger.print("Добавляем мероприятие " + e.getName());
        //logger.print(ctx.getMessage("hello", new Object[]{name}, Locale.US));

        return e;
    }

    @Notifiable
    public Event editEvent(Event e) {
        return e;
    }

    public void deleteEvent() {

    }

    public List<Ticket> getList() {

        List<Ticket> ticketList = new ArrayList<Ticket>();
        ticketList.add(new Ticket(1, 100, "Тестовое мероприятие"));

        return ticketList;
    }

    @PostConstruct
    public void init() {
        logger.print("Создан сервис " + this.getClass().getSimpleName());
    }

    @PreDestroy
    public void destroy() {
        logger.print("Завершен сервис " + this.getClass().getSimpleName());
    }

    @Override
    public void setApplicationContext(ApplicationContext ctx) throws BeansException {
        this.ctx = ctx;
    }
}
