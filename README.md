# FoodDeliverySystem
A food delivery system that gives optimal way to sort orders so that delivery man delivers all orders in minimum time
We are calculating ready time for each order in the batch. Ready time is the sum of preparatimeTime of meal and the time taked by delivery executive to come from his current locationt to restaurant's location.
We are then using a greedy approach where the delivery executive will pick up the orders in the increasing order of their ready time.
We are calculating distance between 2 geolocations by haversine formula.
