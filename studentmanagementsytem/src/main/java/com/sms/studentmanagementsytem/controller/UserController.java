package com.sms.studentmanagementsytem.controller;

import com.sms.studentmanagementsytem.exception.UserNotFoundException;
import com.sms.studentmanagementsytem.model.User;
import com.sms.studentmanagementsytem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    User newuser(@RequestBody User newUser){
        return userRepository.save(newUser);
    }
    @GetMapping("/users")
    List<User> getAllUsers(){
        return userRepository.findAll();
    }
    @GetMapping("/user/{id}")
    User getUserById(@PathVariable long id){
        return userRepository.findById(id)
                .orElseThrow(()->new UserNotFoundException(id));
    }

    @PutMapping("/user/{id}")
    User updateUser(@RequestBody User newUser,@PathVariable Long id){
        return userRepository.findById(id)
                .map(user -> {
                    user.setUsername(newUser.getUsername());
                    user.setKduid(newUser.getKduid());
                    user.setDob(newUser.getDob());
                    user.setAcademicyear(newUser.getAcademicyear());
                    user.setAddress(newUser.getAddress());
                    user.setDegreepro(newUser.getDegreepro());
                    return userRepository.save(user);

                }).orElseThrow(()->new UserNotFoundException(id));
    }

    @DeleteMapping("/user/{id}")
    String deleteUser(@PathVariable Long id){
        if(!userRepository.existsById(id)){
            throw new UserNotFoundException(id);
        }
        userRepository.deleteById(id);
        return "User with id"+id+"has been deleted success.";
    }

}
