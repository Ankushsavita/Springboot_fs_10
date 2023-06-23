package com.geekster.User.Management.System.repository;

import com.geekster.User.Management.System.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepo {

    @Autowired
    public List<User> myUsers;

    public void User(User user) {
        myUsers.add(user);
    }

    public List<User> users() {
        return myUsers;
    }


    public void delete(User user) {
        myUsers.remove(user);
    }
}
