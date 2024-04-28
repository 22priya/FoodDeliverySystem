package com.lucidity.machineCodingRound.FoodDelivery;

public class DeliveryExecutive {
    private  Long id;
    private String name;
    private GeoLocation location;

    private Batch batch;

    public DeliveryExecutive(Long id, String name, GeoLocation location) {
        this.id = id;
        this.name = name;
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

    public GeoLocation getLocation() {
        return location;
    }

    public void setLocation(GeoLocation location) {
        this.location = location;
    }

    public Batch getBatch() {
        return batch;
    }

    public void setBatch(Batch batch) {
        this.batch = batch;
    }
}
