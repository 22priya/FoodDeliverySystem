package com.lucidity.machineCodingRound.FoodDelivery;

import java.util.List;

public class Batch {
    private long batchId;
    private List<Order> orders;
    private DeliveryExecutive deliveryExecutive;

    private Boolean isDelivered;

    public Batch(long batchId, List<Order> orders) {
        this.batchId = batchId;
        this.orders = orders;;
    }

    public long getBatchId() {
        return batchId;
    }

    public void setBatchId(long batchId) {
        this.batchId = batchId;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public DeliveryExecutive getDeliveryExecutive() {
        return deliveryExecutive;
    }

    public void setDeliveryExecutive(DeliveryExecutive deliveryExecutive) {
        this.deliveryExecutive = deliveryExecutive;

    }

    public Boolean getDelivered() {
        return isDelivered;
    }

    public void setDelivered(Boolean delivered) {
        isDelivered = delivered;
    }

    public void calculateReadyTime() {
        for(Order order:orders)
        {
            order.setReadyTime(deliveryExecutive);
        }
    }
}
