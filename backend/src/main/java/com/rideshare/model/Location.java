package com.rideshare.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Location {
    private double latitude;
    private double longitude;
}
