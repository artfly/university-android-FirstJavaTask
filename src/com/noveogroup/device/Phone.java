package com.noveogroup.device;

public class Phone extends AbstractDevice {
    private final int price;
    public Phone(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}