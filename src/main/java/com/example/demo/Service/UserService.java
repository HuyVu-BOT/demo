package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.UserRepository;
import com.example.demo.dtorequest.UserCreationRequest;
import com.example.demo.dtorequest.UserUpdateRequest;
import com.example.demo.exception.AppException;
import com.example.demo.exception.ErrorCode;
import com.example.demo.model.User;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(UserCreationRequest request){
        User user = new User();
        
        if(userRepository.existsByUsername(request.getUsername()))
            throw new AppException(ErrorCode.USER_EXISTED);

        user.setUsername(request.getUsername());
        user.setUserAddress(request.getUserAddress());
        user.setUserPhone(request.getUserPhone());
        user.setUserpw(request.getUserpw());
        return userRepository.save(user);
}

    public User updateUser(String userId, UserUpdateRequest request){
        User user = getUser(userId);
        user.setUserAddress(request.getUserAddress());
        user.setUserPhone(request.getUserPhone());

        return userRepository.save(user);
    }

    public void deleteUser(String userId){
        userRepository.deleteById(userId);
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public User getUser(String id){
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }
}