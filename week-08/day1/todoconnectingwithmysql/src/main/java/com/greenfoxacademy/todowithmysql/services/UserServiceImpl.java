package com.greenfoxacademy.todowithmysql.services;

import com.greenfoxacademy.todowithmysql.models.User;
import com.greenfoxacademy.todowithmysql.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void registerUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User loginUser(String userName, String password) {
        Optional<User> optionalUser = userRepository.findByUsernameAndPassword(userName, password);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.setLoggedIn(true);
            userRepository.save(user); //why here i am saving the user after i set he is logged in, am i saving just his status
            //of logging in to true
            return user;
        }
        return null;
    }

    @Override
    public boolean checkUSer(String userName) {
        var optionalUser = userRepository.findByUsername(userName);
        if (optionalUser.isPresent() && optionalUser.get().isLoggedIn()) {
            return true;
        } else return false;
    }

    @Override
    public User userLogout(String userName) {
        Optional<User> optionalUser = userRepository.findByUsername(userName);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.setLoggedIn(false);
            userRepository.save(user);
            return user;
        }
        return null;
    }

    @Override
    public User findUserByName(String userName) {
        Optional<User> optionalUser = userRepository.findByUsername(userName);
        return optionalUser.orElse(null);
    }
}
