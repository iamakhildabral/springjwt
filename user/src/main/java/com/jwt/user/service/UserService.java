package com.jwt.user.service;

import com.jwt.user.models.User.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"Akhil Dabral","akhildabral@test.com"));
        store.add(new User(UUID.randomUUID().toString(),"Anil Dabral","anildabral@test.com"));
        store.add(new User(UUID.randomUUID().toString(),"Ankit Dabral","ankitdabral@test.com"));
        store.add(new User(UUID.randomUUID().toString(),"Anika Dabral","anikadabral@test.com"));
    }

    public List<User> getUsers() {
        return this.store;
    }
}
