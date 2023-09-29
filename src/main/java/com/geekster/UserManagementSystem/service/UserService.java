package com.geekster.UserManagementSystem.service;

import com.geekster.UserManagementSystem.model.User;
import com.geekster.UserManagementSystem.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public String addUser(User newUser){
        userRepo.getUserMap().put(newUser.getUserId(), newUser);
        return "new user is added";
    }

    public User getUserById(Integer userId) {
        return userRepo.getUserMap().getOrDefault(userId, null);
    }

    public List<User> getAllUser() {

        List<User> userList = new ArrayList<>();
        for(Integer key : userRepo.getUserMap().keySet()){
            userList.add(userRepo.getUserMap().get(key));
        }
        return userList;
    }

    public String updateUserInfo(User newUser) {
        userRepo.getUserMap().put(newUser.getUserId(), newUser);
        return "user updated";
    }

    public String deleteUserById(Integer userId) {

        if(userRepo.getUserMap().getOrDefault(userId,null) != null){
            userRepo.getUserMap().remove(userId);
            return "User deleted";
        }else{
            return "Invalid User";
        }
    }
}
