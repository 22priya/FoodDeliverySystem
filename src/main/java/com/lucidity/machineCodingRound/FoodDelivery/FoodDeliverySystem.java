package com.lucidity.machineCodingRound.FoodDelivery;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FoodDeliverySystem {
    private String name;
    private List<DeliveryExecutive> deliveryExecutives;
    private List<Restaurant> restaurants;
    private  List<Customer> customers;

    public FoodDeliverySystem(String name) {
        this.name = name;
        this.deliveryExecutives=new ArrayList<>();
        this.customers=new ArrayList<>();
        this.restaurants=new ArrayList<>();
    }

    public void addCustomer(Customer c)
    {
        customers.add(c);
    }

    public void addRestaurant(Restaurant restaurant)
    {
        restaurants.add(restaurant);
    }

    public void addDeliveryExecutive(DeliveryExecutive deliveryExecutive)
    {
        deliveryExecutives.add(deliveryExecutive);
    }

    public void GetOrderOfOrdersForShortestTimeDelivery(Batch batch) {
        Collections.sort(batch.getOrders(),new SortOrderByReadyTime());
    }
}
