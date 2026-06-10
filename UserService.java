package org.example.services;

import org.example.entities.User;
import org.example.repository.UserRepository;

public class UserService {
    private User loggedInUser;
   private UserRepository repository = new UserRepository();
   public void register(String userId,String name,String password){
       User exsistingUser=repository.findByName(name);
       if(exsistingUser!=null){
           System.out.println("user is already exsiting!");
           return;
       }
       String hashedPassword=Integer.toString(password.hashCode());
       User user = new User(userId,name,null,hashedPassword);
       repository.save(user);
       System.out.println("registered Succesfully!!!");
   }
    public void login(String name,String password){
       User user = repository.findByName(name);
       if(user==null){
           System.out.println("user not found!");
           return;
       }
        String hashedPassword=Integer.toString(password.hashCode());
       if(user.getHashedPassword().equals(hashedPassword)){
           System.out.println("login Succesful!");
       }
       else System.out.println("incorrect password");
       loggedInUser=user;
    }

    public User getLoggedInUser() {
        return loggedInUser;
    }
    public void logout(){
       loggedInUser=null;
        System.out.println("Logged out successfully!");
    }
}
