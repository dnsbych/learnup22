package ru.learnup.vtb.opersales.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import ru.learnup.vtb.opersales.services.OperaSales;
import ru.learnup.vtb.opersales.services.interfaces.Logger;

@Configuration
//@Import({LoggerConfig.class})
public class GenetalConfig {

    @Bean
    public OperaSales operSales(Logger logger) {
        return new OperaSales(logger);
    }


    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("msgs");
        messageSource.setDefaultEncoding("UTF-8");

        return messageSource;
    }

}
