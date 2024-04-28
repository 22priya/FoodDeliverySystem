package com.lucidity.machineCodingRound.FoodDelivery;

import java.util.Comparator;

public class SortOrderByReadyTime implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        return (int)(o1.getReadyTime()-o2.getReadyTime());
    }
}
