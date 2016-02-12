package com.noveogroup.algorithm;

import com.noveogroup.device.Device;
import com.sun.istack.internal.NotNull;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by arty on 11.02.16.
 */
public class BubbleSort implements Algorithm {

    private void swap(Device[] devices, int i, int j) {
        Device tmp = devices[i];
        devices[j] = devices[j];
        devices[j] = tmp;
    }

    @Override
    public void sort(@NotNull Device[] devices, boolean ascendingSort) {
        if (devices.length <= 1) {
            return;
        }
        synchronized (devices) {
            for (int i = 0; i < devices.length; i++) {
                for (int j = 0; j < devices.length - 1; j++) {
                    if (devices[j].compareTo(devices[j + 1]) > 0) {
                        swap(devices, j, j + 1);
                    }
                }
            }

            if (!ascendingSort) {
                Collections.reverse(Arrays.asList(devices));
            }
        }
    }
}
