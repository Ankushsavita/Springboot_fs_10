package com.geekster.User.Management.System.service;

import com.geekster.User.Management.System.model.User;
import com.geekster.User.Management.System.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public String addUsers(User user) {
         userRepo.User(user);
         return "user added successfully!..";
    }

    public List<User> getAllUsers() {
        return userRepo.users();
    }

    public User getUserById(Integer userId) {
        for(User myUser : userRepo.myUsers){
            if(myUser.getUserId().equals(userId)){
                return myUser;
            }
        }
        throw new IllegalStateException("user not found");
    }

    public String updateUser(Integer userId, User newUser) {
        for(User user: userRepo.myUsers){
            if(user.getUserId().equals(userId)){

                user.setUserId(newUser.getUserId());
                user.setUserName(newUser.getUserName());
                user.setDateOfBirth(newUser.getDateOfBirth());
                user.setEmail(newUser.getEmail());
                user.setPhoneNumber(newUser.getPhoneNumber());
                user.setDate(newUser.getDate());
                user.setTime(newUser.getTime());

                return "user updated for user ID:" + userId;

            }
        }
        return "user not found for user ID:" + userId;

    }

    public String removeUser(Integer userId) {
        for(User user: userRepo.myUsers){
            if(user.getUserId().equals(userId)){
                userRepo.delete(user);

                return "user removed for todo ID:" + userId;
            }
        }
        return "user :" + userId + " not deleted as it doesn't exist" ;

    }
}
