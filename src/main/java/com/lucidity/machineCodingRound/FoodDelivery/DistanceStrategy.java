package com.lucidity.machineCodingRound.FoodDelivery;

public interface DistanceStrategy {
    double calculateDistance(GeoLocation startLocation,GeoLocation destinationLocation);
}
