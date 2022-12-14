package com.example.dashboarda.service;

import com.example.dashboarda.model.User;

public interface UserService {

    User join(String userName, String password);
}
