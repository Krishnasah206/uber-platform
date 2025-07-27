package com.rideshare.service;

import com.rideshare.model.User;
import org.bson.types.ObjectId;

import java.util.Optional;

public interface UserService {
    User registerUser(User user);
    Optional<User> getUserById(ObjectId id);
    Optional<User> getUserByEmail(String email);
}
