package ru.learnup.vtb.opersales.learnup19.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import ru.learnup.vtb.opersales.learnup19.services.OperSales;
import ru.learnup.vtb.opersales.learnup19.services.interfaces.Logger;

@Configuration
//@Import({LoggerConfig.class})
public class GenetalConfig {

    @Bean
    public OperSales operSales(Logger logger) {
        return new OperSales(logger);
    }


    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("msgs");
        messageSource.setDefaultEncoding("UTF-8");

        return messageSource;
    }

}
