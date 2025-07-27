package com.rideshare.service;

import com.rideshare.model.RideRequest;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Optional;

public interface RideService {
    RideRequest createRideRequest(RideRequest request);
    Optional<RideRequest> getRideById(ObjectId id);
    List<RideRequest> getRidesByRider(ObjectId riderId);
    List<RideRequest> getRidesByDriver(ObjectId driverId);
    RideRequest updateRideStatus(ObjectId id, RideRequest updatedRide);
}
