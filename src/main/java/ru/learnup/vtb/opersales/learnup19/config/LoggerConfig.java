package ru.learnup.vtb.opersales.learnup19.config;

import org.springframework.context.annotation.Bean;
import ru.learnup.vtb.opersales.learnup19.services.ConsoleLogger;
import ru.learnup.vtb.opersales.learnup19.services.interfaces.Logger;

//@Configuration
public class LoggerConfig {
    @Bean
    public Logger logger() {
        return new ConsoleLogger();
    }
}
