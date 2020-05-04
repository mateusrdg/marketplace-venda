package com.marketplace.venda.config;

import com.marketplace.venda.service.MQTeste;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfig {

    @Autowired
    private MQTeste dbTeste;

    @Bean
    public void testDatabase() {
        dbTeste.testDatabase();
    }
}
