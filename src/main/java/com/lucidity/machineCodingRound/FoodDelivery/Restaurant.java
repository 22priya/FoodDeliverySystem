package com.lucidity.machineCodingRound.FoodDelivery;

public class Restaurant {
    private Long id;
    private String name;
    private Double avgTimeToPrepareMealInMinutes;
    private GeoLocation location;

    public Restaurant(Long id, String name, Double avgTimeToPrepareMeal, GeoLocation location) {
        this.id = id;
        this.name = name;
        this.avgTimeToPrepareMealInMinutes = avgTimeToPrepareMeal;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAvgTimeToPrepareMeal() {
        return avgTimeToPrepareMealInMinutes;
    }

    public void setAvgTimeToPrepareMeal(Double avgTimeToPrepareMeal) {
        this.avgTimeToPrepareMealInMinutes = avgTimeToPrepareMeal;
    }

    public GeoLocation getLocation() {
        return location;
    }

    public void setLocation(GeoLocation location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", avgTimeToPrepareMealInMinutes=" + avgTimeToPrepareMealInMinutes +
                '}';
    }
}
