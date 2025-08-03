package com.akash.resful_2.service;

import com.akash.resful_2.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class UserService {

    private static final List<User> users = new ArrayList<>();
    private static final AtomicLong idCounter = new AtomicLong(1);

    static {
        users.add(new User(idCounter.getAndIncrement(), "Akash"));
        users.add(new User(idCounter.getAndIncrement(), "Sahil"));
        users.add(new User(idCounter.getAndIncrement(), "Aman"));
    }

    public List<User> getAllUsers() {
        return users;
    }

    public User findOne(int id) {
        return users.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
    }

    public User deleteUserByID(int id) {
        User user = findOne(id);
       users.remove(user);
       return user;
    }

    public User createUser(User user) {
        user.setId(idCounter.getAndIncrement());
        users.add(user);
        return user;
    }
}