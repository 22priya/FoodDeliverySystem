package com.lucidity.machineCodingRound.FoodDelivery;

public class HaversineDistanceStrategy implements DistanceStrategy{
    @Override
    public double calculateDistance(GeoLocation startLocation, GeoLocation destinationLocation) {
        double dLat=Math.toRadians(startLocation.getLatitude()-destinationLocation.getLatitude());
        double dLong=Math.toRadians(startLocation.getLongitude()-destinationLocation.getLongitude());

        double a= Math.sin(dLat/2) * Math.sin(dLat/2) +
                  Math.cos(Math.toRadians(startLocation.getLatitude())) *
                          Math.cos(Math.toRadians(destinationLocation.getLatitude())) *
                          Math.sin(dLong/2) * Math.sin(dLong/2);

        double c= 2 * Math.atan2(Math.sqrt(a),Math.sqrt(1-a));

        return Constant.EARTH_RADIUS_KM * c;
        //returns haversine distance in km
    }
}
