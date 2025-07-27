package com.rideshare.service;

import com.rideshare.model.Ride;
import com.rideshare.model.User;
import com.rideshare.repository.RideRepository;
import com.rideshare.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class AdminService {

    private final UserRepository userRepository;
    private final RideRepository rideRepository;

    public Map<String, Object> getDashboardStats() {
        long totalUsers = userRepository.count();
        long totalRides = rideRepository.count();
        long completedRides = rideRepository.countByStatus("COMPLETED");
        long cancelledRides = rideRepository.countByStatus("CANCELLED");

        return Map.of(
                "totalUsers", totalUsers,
                "totalRides", totalRides,
                "completedRides", completedRides,
                "cancelledRides", cancelledRides
        );
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void deactivateUser(String userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));
        user.setActive(false);
        userRepository.save(user);
    }

    public List<Ride> getAllRides() {
        return rideRepository.findAll();
    }
}
