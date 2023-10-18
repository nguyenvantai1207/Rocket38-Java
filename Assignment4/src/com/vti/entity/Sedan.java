package com.vti.entity;

public class Sedan extends Car {
    private int length;

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    @Override
    public double getSalePrice() {
        if (length > 20) {
            return super.getSalePrice() - (super.getSalePrice() * 0.05);
        }
        return super.getSalePrice() - (super.getSalePrice() * 0.1);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
