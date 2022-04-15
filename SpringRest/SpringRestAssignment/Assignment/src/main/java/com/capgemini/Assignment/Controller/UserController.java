package com.capgemini.Assignment.Controller;

import com.capgemini.Assignment.Service.UserService;
import com.capgemini.Assignment.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/getallusers")
    List<User> getAllUsers()
    {
        System.out.println("From Getallusers Method.");
        List<User> userList=userService.getAllUsers();
        return userList;
    }

    @GetMapping("/getuser/{userid}")
    User getUser(@PathVariable("userid") int userid)
    {
        System.out.println("From Get User Method.");
        return userService.getUser(userid);
    }

    @PostMapping("/adduser")
    User addUser(@RequestBody User user)
    {
        System.out.println("From Add User Method.");
        return userService.addUser(user);
    }

    @PutMapping("/updateuser")
    User updateUser(@RequestBody User user)
    {
        System.out.println("From Update User Method.");
        return userService.updateUser(user);
    }

    @DeleteMapping("/deleteuser/{userid}")
    void deleteUser(@PathVariable("userid") int userid)
    {
        System.out.println("From Delete User Method.");
        userService.deleteUser(userid);
    }
}
