package com.rideshare.controller;

import com.rideshare.model.User;
import com.rideshare.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/{userId}/profile")
    public ResponseEntity<?> getProfile(@PathVariable String userId) {
        return ResponseEntity.ok(userService.getUserProfile(userId));
    }

    @PutMapping("/{userId}/profile")
    public ResponseEntity<?> updateProfile(@PathVariable String userId, @RequestBody User updatedUser) {
        return ResponseEntity.ok(userService.updateUser(userId, updatedUser));
    }

    @GetMapping("/{userId}/wallet")
    public ResponseEntity<?> getWallet(@PathVariable String userId) {
        return ResponseEntity.ok(userService.getWallet(userId));
    }

    @PostMapping("/{userId}/wallet/add")
    public ResponseEntity<?> addToWallet(@PathVariable String userId, @RequestParam double amount) {
        return ResponseEntity.ok(userService.addBalance(userId, amount));
    }
}

