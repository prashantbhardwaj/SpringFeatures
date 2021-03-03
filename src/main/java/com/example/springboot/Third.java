package com.example.springboot;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class Third implements InitializingBean {

    @Autowired
    private Map<String, ImplementMe> allImpl;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("******");
        allImpl.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey()+ " - " + entry.getValue().getClass().getCanonicalName());
        });

    }
}
