package com.noveogroup.algorithm;

import com.noveogroup.device.Device;
import com.sun.istack.internal.NotNull;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by arty on 11.02.16.
 */
public class InsertionSort implements Algorithm {

    @Override
    public void sort(@NotNull Device[] devices, boolean ascendingSort) {
        if (devices.length < 2)
            return;
        synchronized (devices) {
            Device key;
            for (int j = 1; j < devices.length; j++) {
                key = devices[j];
                int i = j - 1;
                while (i >= 0 && devices[i].compareTo(key) > 0) {
                    devices[i + 1] = devices[i];
                    i = i - 1;
                }
                devices[i + 1] = key;
            }

            if (!ascendingSort)
                Collections.reverse(Arrays.asList(devices));
        }
    }
}
