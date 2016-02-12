package com.noveogroup.device;

/**
 * Created by arty on 11.02.16.
 */
public class Tablet extends AbstractDevice {
    private final int price;
    public Tablet (int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
