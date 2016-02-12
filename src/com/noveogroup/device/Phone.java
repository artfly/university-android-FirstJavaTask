package com.noveogroup.device;

public class Phone extends AbstractDevice {
    private int price;
    public Phone(int price) {
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