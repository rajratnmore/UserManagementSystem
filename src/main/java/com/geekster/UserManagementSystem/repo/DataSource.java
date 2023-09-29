package com.geekster.UserManagementSystem.repo;

import com.geekster.UserManagementSystem.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class DataSource {

    @Bean
    Map<Integer, User> getUserMap(){
        return new HashMap<>();
    }
}
