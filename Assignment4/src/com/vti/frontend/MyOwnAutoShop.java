package com.vti.frontend;

import com.vti.entity.Car;
import com.vti.entity.Ford;
import com.vti.entity.Sedan;
import com.vti.entity.Truck;

public class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(120, 20000, "Red", 22);
        Ford ford1 = new Ford(140, 25000, "Blue", 2019, 1000);
        Ford ford2 = new Ford(130, 22000, "Black", 2020, 800);
        Car car = new Car(100, 15000, "Green");

        System.out.println("Sedan Sale Price: $" + sedan.getSalePrice());
        System.out.println("Ford 1 Sale Price: $" + ford1.getSalePrice());
        System.out.println("Ford 2 Sale Price: $" + ford2.getSalePrice());
        System.out.println("Car Sale Price: $" + car.getSalePrice());
    }
}
