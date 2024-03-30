package com.driver;

public class Order {

    private String id;
    private int deliveryTime;

    public Order(String id, String deliveryTime) {

        this.id = id;

        // The deliveryTime has to converted from string to int and then stored in the attribute
        //deliveryTime  = HH*60 + MM
        String spl[] = deliveryTime.split(":");

        int hours = Integer.parseInt(spl[0]);
        int mins = Integer.parseInt(spl[1]);

        this.deliveryTime = hours * 60 + mins;
    }

    public String getId() {
        return id;
    }

    public int getDeliveryTime() {return deliveryTime;}
}
