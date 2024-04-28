package com.lucidity.machineCodingRound.FoodDelivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitStreamTemplateConfigurer;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class FoodDeliveryApplication {

	public static void main(String[] args) {

		FoodDeliverySystem zomato=new FoodDeliverySystem("Zomato");

		//Add 5 customers
		Customer rachel=new Customer(1L,"Rachel","rachel@gmail.com",new GeoLocation(12.9756,77.6057));
		Customer monica=new Customer(2L,"Monica","monica@gmail.com",new GeoLocation(12.9770,77.5953));
		Customer phoebe=new Customer(3L,"Phoebe","phoebe@gmail.com",new GeoLocation(12.9982,77.5919));
		Customer ross=new Customer(4L,"Ross","ross@gmail.com",new GeoLocation(12.9507,77.5848));
		Customer chandler=	new Customer(5L,"Chandler","chandler@gmail.com",new GeoLocation(12.9698,77.7500));
		zomato.addCustomer(rachel);
		zomato.addCustomer(monica);
		zomato.addCustomer(phoebe);
		zomato.addCustomer(ross);
		zomato.addCustomer(chandler);

		//Add 3 restaurants
		Restaurant rameshwaramCafe=new Restaurant(1L,"Rameshwaram Cafe",45.0,new GeoLocation(12.9295,77.5824));
		Restaurant ironHill=new Restaurant(2L,"Iron Hill",70.0,new GeoLocation(12.9352,77.6259));
		Restaurant zoho=new Restaurant(3L,"Zoho",20.0,new GeoLocation(12.9719,77.6412));
		zomato.addRestaurant(rameshwaramCafe);
		zomato.addRestaurant(ironHill);
		zomato.addRestaurant(zoho);

		//Add a delievry Executive
		DeliveryExecutive aman=new DeliveryExecutive(1L,"Aman",new GeoLocation(13.0097,77.5510));
		zomato.addDeliveryExecutive(aman);

		//create 2 orders
		List<Order> orders=new ArrayList<>();
		orders.add(new Order(2L,ross,ironHill));
		orders.add(new Order(1L,phoebe,rameshwaramCafe));
		orders.add(new Order(3L,monica,zoho));

		//create a batch of orders
		Batch batch=new Batch(1L,orders);
		batch.setDeliveryExecutive(aman);
		aman.setBatch(batch);

		//calculate readyTime for each order
		batch.calculateReadyTime();

		//sort the orders based on their ready time
		zomato.GetOrderOfOrdersForShortestTimeDelivery(aman.getBatch());

		System.out.println("The delivery executive should pickup and deliver the order in below printed order");
		for(Order order :aman.getBatch().getOrders())
		{
			System.out.println(order);
		}

	}

}
