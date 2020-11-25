package com.greenfoxacademy.workshop.Services;

import com.greenfoxacademy.workshop.Models.MyUser;
import com.greenfoxacademy.workshop.Repositories.MyUserRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {

    private final MyUserRepository myUserRepository;

    public MyUserDetailsService(MyUserRepository myUserRepository) {
        this.myUserRepository = myUserRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        MyUser user = myUserRepository.findMyUserByUserName(username).get();
        return new User(user.getUserName(), user.getPassWord(), new ArrayList<>());
    }
}
