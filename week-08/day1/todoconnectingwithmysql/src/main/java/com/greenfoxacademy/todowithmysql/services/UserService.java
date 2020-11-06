package com.greenfoxacademy.todowithmysql.services;

import com.greenfoxacademy.todowithmysql.models.User;

public interface UserService {
        void registerUser(User user);
        User loginUser(String userName, String password);
        boolean checkUSer(String userName);
        User userLogout(String userName);
        User findUserByName(String userName);
}
