package com.noveogroup.main;

import com.noveogroup.algorithm.Algorithm;
import com.noveogroup.device.Device;

import java.util.Arrays;

/**
 * Created by arty on 12.02.16.
 */
public class SortThread implements Runnable {
    final private Device[] devices;
    private Algorithm algorithm;

    public SortThread(Device[] devices, Algorithm algorithm) {
        this.devices = devices;
        this.algorithm = algorithm;
    }


    @Override
    public void run() {
        algorithm.sort(devices, Thread.currentThread().getId() % 2 == 0);
    }
}
