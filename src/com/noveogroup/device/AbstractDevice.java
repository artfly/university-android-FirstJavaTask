package com.noveogroup.device;

/**
 * Created by arty on 11.02.16.
 */
public abstract class AbstractDevice implements Device {

    @Override
    public int compareTo(Device o) {
        return this.getPrice() - o.getPrice();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "@" + getPrice();
    }
}
