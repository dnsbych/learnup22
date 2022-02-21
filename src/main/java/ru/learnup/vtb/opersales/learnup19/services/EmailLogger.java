package ru.learnup.vtb.opersales.learnup19.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import ru.learnup.vtb.opersales.learnup19.services.interfaces.Logger;

@Component
@Profile("Email")
public class EmailLogger implements Logger {
    @Override
    public void print(Object object) {
        System.out.println("Отправка на email: " + object);
    }
}
