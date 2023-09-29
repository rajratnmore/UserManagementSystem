package com.geekster.UserManagementSystem.repo;

import com.geekster.UserManagementSystem.model.User;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Getter
@Repository
public class UserRepo {

    @Autowired
    private Map<Integer, User> userMap;

}
