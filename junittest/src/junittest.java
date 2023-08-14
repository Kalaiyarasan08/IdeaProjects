//package org.example;

import java.time.LocalTime;
import java.util.Scanner;

public class junittest {
    static int car_qty = 10, bus_qty = 20, ev_qty = 30;
    static float cost, costToPaid, discount;
    static LocalTime saleStartTime = LocalTime.of(15, 0);
    static LocalTime saleEndTime=saleStartTime.plusHours(1);
    public static void vehicle(String v) {
        if (v.equals("car")) {
            car_qty = car_qty - 1;
        } else if (v.equals("ev")) {
            ev_qty = ev_qty - 1;
        } else {
            bus_qty = bus_qty - 1;
        }
    }

    public static void pricing(String v) {
        float carprice = 700000.00F;
        float busprice = 5000000.00F;
        float evprice = 1500000.00F;


        if (v.equals("car")) {
            cost = carprice;
        } else if (v.equals("ev")) {
            cost = evprice;
        } else {
            cost = busprice;
        }
    }

    public static void discount() {
        if (cost <= 700000) {
            costToPaid = cost;
        } else if (cost > 700000 && cost <= 1500000) {
            discount = (cost * 10) / 100;
            costToPaid = cost - discount;
        } else {
            discount = (cost * 30) / 100;
            costToPaid = cost - discount;
        }
    }

    public static void salestimeperiod() {
        LocalTime currentTime = LocalTime.now();
        if (currentTime.isAfter(saleStartTime) && currentTime.isBefore(saleEndTime))
        {   System.out.println("Sale is currently active!"); }
        else {
            System.out.println("Sale is not active at the moment.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Vehicle Type: (car or ev or bus)");
        String v = sc.nextLine();

        vehicle(v);
        pricing(v);
        discount();
        salestimeperiod();

        System.out.println("Quantity Left - Car: " + car_qty + ", Bus: " + bus_qty + ", EV: " + ev_qty);
        System.out.println("Cost to be Paid: " + costToPaid);
    }
}
