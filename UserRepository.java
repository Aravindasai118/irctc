package org.example.repository;

import org.example.entities.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> users = new ArrayList<>();
    public void save(User user){

        users.add(user);
    }
    public User findByName(String name){
        for(User user:users){
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;

    }

}
