package com.rideshare.model;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ride_requests")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RideRequest {

    @Id
    private ObjectId id;

    private ObjectId riderId;

    private ObjectId assignedDriverId;

    private String pickupLocation;
    private String dropLocation;

    private RideStatus status;

    private Double estimatedFare;
}
