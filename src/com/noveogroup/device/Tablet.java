package com.noveogroup.device;

/**
 * Created by arty on 11.02.16.
 */
public class Tablet extends AbstractDevice {
    private int price;
    public Tablet (int price) {
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
