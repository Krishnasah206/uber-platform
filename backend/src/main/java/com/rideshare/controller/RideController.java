package com.rideshare.controller;

import com.rideshare.service.RideService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rides")
@RequiredArgsConstructor
public class RideController {

    private final RideService rideService;

    @PostMapping("/request")
    public ResponseEntity<?> requestRide(@RequestBody RideRequestDto requestDto) {
        return ResponseEntity.ok(rideService.requestRide(requestDto));
    }

    @PostMapping("/{rideId}/cancel")
    public ResponseEntity<?> cancelRide(@PathVariable String rideId) {
        rideService.cancelRide(rideId);
        return ResponseEntity.ok("Ride cancelled");
    }

    @PostMapping("/{rideId}/complete")
    public ResponseEntity<?> completeRide(@PathVariable String rideId) {
        rideService.completeRide(rideId);
        return ResponseEntity.ok("Ride completed");
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<?> getUserRides(@PathVariable String userId) {
        return ResponseEntity.ok(rideService.getRidesForUser(userId));
    }
}

