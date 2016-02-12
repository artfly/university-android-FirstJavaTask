package com.noveogroup.device;

/**
 * Created by arty on 11.02.16.
 */
public class Laptop extends AbstractDevice {
    private final int price;
    public Laptop (int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
