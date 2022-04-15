package com.capgemini.Assignment.Service;

import com.capgemini.Assignment.Repository.UserRepository;
import com.capgemini.Assignment.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> getAllUsers(){
        List<User> userList = new ArrayList<User>();
        repository.findAll().forEach(x -> userList.add(x));
        return userList;
    }

    public User getUser(int userid)
    {
        List<User> userList = new ArrayList<>();
        User user1=new User();
        repository.findById(userid).get();
        return repository.findById(userid).get();
    }

    public User addUser(User user){
        User u1 = repository.save(user);
        return u1;
    }

    public User updateUser(User user){
        User u2 = repository.save(user);
        return u2;
    }

    public void deleteUser(int userid)
    {
        repository.deleteById(userid);
    }
}
