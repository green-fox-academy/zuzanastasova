package com.greenfoxacademy.workshop.Services;

import com.greenfoxacademy.workshop.Models.DTOs.RegisterDTO;
import com.greenfoxacademy.workshop.Models.MyUser;
import com.greenfoxacademy.workshop.Repositories.MyUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MyUserServiceImpl implements MyUserService{

    private final MyUserRepository myUserRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public MyUserServiceImpl(MyUserRepository myUserRepository, PasswordEncoder passwordEncoder) {
        this.myUserRepository = myUserRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public MyUser findMyUserByUsername(String username) {
        return myUserRepository.findMyUserByUserName(username).get();
    }

    @Override
    public ResponseEntity<Object> registerUser(RegisterDTO registerDTO) {
        if(!(myUserRepository.findMyUserByUserName(registerDTO.getRegisterUserName()).isPresent())) {
            MyUser user = new MyUser(registerDTO);
            user.setPassWord(passwordEncoder.encode(user.getPassWord()));
            myUserRepository.save(user);
            return ResponseEntity.ok().build();
        } return new ResponseEntity<>("Username is already taken!", HttpStatus.UNAUTHORIZED);
    }
}
