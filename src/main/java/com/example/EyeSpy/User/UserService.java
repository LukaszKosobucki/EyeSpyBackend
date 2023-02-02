package com.example.EyeSpy.User;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    public List<User> getUsers() {
        return List.of(new User(UUID.randomUUID(), "himikov", "himikov@gmail.com"));

    }

}
