package com.rideshare.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/drivers")
@RequiredArgsConstructor
public class DriverController {

    private final DriverService driverService;

    @PostMapping("/register")
    public ResponseEntity<?> registerDriver(@RequestBody Driver driver) {
        return ResponseEntity.ok(driverService.registerDriver(driver));
    }

    @PutMapping("/{driverId}/status")
    public ResponseEntity<?> updateStatus(@PathVariable String driverId, @RequestParam boolean available) {
        return ResponseEntity.ok(driverService.updateAvailability(driverId, available));
    }

    @PutMapping("/{driverId}/location")
    public ResponseEntity<?> updateLocation(@PathVariable String driverId, @RequestBody LocationDto locationDto) {
        driverService.updateLocation(driverId, locationDto);
        return ResponseEntity.ok("Location updated");
    }

    @GetMapping("/{driverId}/rides")
    public ResponseEntity<?> getAssignedRides(@PathVariable String driverId) {
        return ResponseEntity.ok(driverService.getAssignedRides(driverId));
    }
}

