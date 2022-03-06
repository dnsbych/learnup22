package ru.learnup.vtb.opersales.config;

import org.springframework.context.annotation.Bean;
import ru.learnup.vtb.opersales.services.ConsoleLogger;
import ru.learnup.vtb.opersales.services.interfaces.Logger;

//@Configuration
public class LoggerConfig {
    @Bean
    public Logger logger() {
        return new ConsoleLogger();
    }
}
