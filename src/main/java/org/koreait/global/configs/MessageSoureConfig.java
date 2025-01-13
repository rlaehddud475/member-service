package org.koreait.global.configs;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class MessageSoureConfig {
    @Bean
    public MessageSource messageSource(){

        ResourceBundleMessageSource ms = new ResourceBundleMessageSource();
        ms.addBasenames("message.commons","messages.validations","message.errors");
        ms.setDefaultEncoding("utf-8");
        return ms;
    }
}
