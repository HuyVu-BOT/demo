package com.example.demo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.UserService;
import com.example.demo.dtorequest.APIRespond;
import com.example.demo.dtorequest.UserCreationRequest;
import com.example.demo.dtorequest.UserUpdateRequest;
import com.example.demo.model.User;

import jakarta.validation.Valid;



@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired  
    private UserService userService;

    @PostMapping

    APIRespond<User> createUser(@RequestBody @Valid UserCreationRequest request){
        APIRespond<User> apiRespond = new APIRespond<>();
        apiRespond.setResult(userService.createUser(request));
        return apiRespond;
    }

    @GetMapping
    List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/{userId}")
    User getUser(@PathVariable("userId") String userID){
        return userService.getUser(userID);
    }

    @PutMapping("/{userId}")
    User updateUser(@PathVariable String userId, @RequestBody UserUpdateRequest request){
        return userService.updateUser(userId, request);
    }

    @DeleteMapping("/{userId}")
    String deleteUser(@PathVariable String userId){
        userService.deleteUser(userId);
        return "User has been deleted successfully";
    }
}