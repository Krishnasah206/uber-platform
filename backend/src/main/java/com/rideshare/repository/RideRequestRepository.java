package com.rideshare.repository;

import com.rideshare.model.RideRequest;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RideRequestRepository extends MongoRepository<RideRequest, ObjectId> {
    List<RideRequest> findByRiderId(ObjectId riderId);
    List<RideRequest> findByAssignedDriverId(ObjectId driverId);
}
