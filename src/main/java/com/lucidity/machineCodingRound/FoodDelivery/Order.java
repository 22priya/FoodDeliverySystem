package com.lucidity.machineCodingRound.FoodDelivery;

public class Order {
    private Long orderId;
    private Customer customer;
    private Restaurant restaurant;
    private Boolean isDelivered;

    private DistanceStrategy strategy;

    private Double readyTime;

    public Order(Long orderId, Customer customer, Restaurant restaurant) {
        this.orderId = orderId;
        this.customer = customer;
        this.restaurant = restaurant;
        this.strategy=new HaversineDistanceStrategy();
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Boolean getDelivered() {
        return isDelivered;
    }

    public void setDelivered(Boolean delivered) {
        isDelivered = delivered;
    }

    //meal preparation time and travel time from delievery man location to restaurnt

    public Double getReadyTime() {
        return readyTime;
    }

    public void setReadyTime(DeliveryExecutive deliveryExecutive) {
        readyTime = restaurant.getAvgTimeToPrepareMeal() + (strategy.calculateDistance(deliveryExecutive.getLocation(),restaurant.getLocation())*60)/Constant.SPEED_KMPH;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customer=" + customer +
                ", restaurant=" + restaurant +
                ", readyTime=" + readyTime +
                '}';
    }
}
