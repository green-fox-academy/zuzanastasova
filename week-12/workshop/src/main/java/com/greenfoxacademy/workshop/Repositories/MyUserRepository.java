package com.greenfoxacademy.workshop.Repositories;

import com.greenfoxacademy.workshop.Models.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MyUserRepository extends JpaRepository<MyUser, Long> {

    Optional<MyUser> findMyUserByUserName (String userName);

    Boolean existsMyUserByUserName(String registerUserName);

}
