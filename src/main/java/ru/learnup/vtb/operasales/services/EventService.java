package ru.learnup.vtb.operasales.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import ru.learnup.vtb.operasales.model.Event;
import ru.learnup.vtb.operasales.model.Ticket;
import ru.learnup.vtb.operasales.services.interfaces.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;


public class OperaSales implements ApplicationContextAware {

    private Logger logger;
    private ApplicationContext ctx;

    @Autowired
    public OperaSales(Logger logger) {
        this.logger = logger;
    }


    public Event addEvent(Event e) {
        //logger.print("Добавляем мероприятие " + e.getName());
        //logger.print(ctx.getMessage("hello", new Object[]{name}, Locale.US));

        return e;
    }


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
//        logger.print("Создан сервис " + this.getClass().getSimpleName());
    }

    @PreDestroy
    public void destroy() {
//        logger.print("Завершен сервис " + this.getClass().getSimpleName());
    }

    @Override
    public void setApplicationContext(ApplicationContext ctx) throws BeansException {
        this.ctx = ctx;
    }
}
