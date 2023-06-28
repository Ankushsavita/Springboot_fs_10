package com.geekster.User.Management.System.service;

import com.geekster.User.Management.System.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanFactory {

    @Bean
    public List<User> DataSource(){
        return new ArrayList<>();
    }
}
