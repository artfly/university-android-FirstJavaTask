package com.noveogroup.device;

/**
 * Created by arty on 11.02.16.
 */
public class Laptop extends AbstractDevice {
    private int price;
    public Laptop (int price) {
        setPrice(price);
    }

    @Override
    public int getPrice() {
        return price;
    }

    private void setPrice(int price) {
        if (price < 0)
            throw new IllegalArgumentException();
        this.price = price;
    }
}
