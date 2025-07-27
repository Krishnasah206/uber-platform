package com.rideshare.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {

    private final AdminService adminService;

    @GetMapping("/stats")
    public ResponseEntity<?> getPlatformStats() {
        return ResponseEntity.ok(adminService.getDashboardStats());
    }

    @GetMapping("/users")
    public ResponseEntity<?> getAllUsers() {
        return ResponseEntity.ok(adminService.getAllUsers());
    }

    @DeleteMapping("/user/{userId}")
    public ResponseEntity<?> deactivateUser(@PathVariable String userId) {
        adminService.deactivateUser(userId);
        return ResponseEntity.ok("User deactivated");
    }

    @GetMapping("/rides")
    public ResponseEntity<?> getAllRides() {
        return ResponseEntity.ok(adminService.getAllRides());
    }
}

