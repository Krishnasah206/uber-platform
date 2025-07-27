package com.rideshare.service;

import com.rideshare.model.RideRequest;
import com.rideshare.repository.RideRequestRepository;
import com.rideshare.service.RideService;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RideServiceImpl implements RideService {

    private final RideRequestRepository rideRequestRepository;

    @Override
    public RideRequest createRideRequest(RideRequest request) {
        return rideRequestRepository.save(request);
    }

    @Override
    public Optional<RideRequest> getRideById(ObjectId id) {
        return rideRequestRepository.findById(id);
    }

    @Override
    public List<RideRequest> getRidesByRider(ObjectId riderId) {
        return rideRequestRepository.findByRiderId(riderId);
    }

    @Override
    public List<RideRequest> getRidesByDriver(ObjectId driverId) {
        return rideRequestRepository.findByAssignedDriverId(driverId);
    }

    @Override
    public RideRequest updateRideStatus(ObjectId id, RideRequest updatedRide) {
        updatedRide.setId(id);
        return rideRequestRepository.save(updatedRide);
    }
}
