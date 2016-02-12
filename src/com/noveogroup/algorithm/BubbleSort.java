package com.noveogroup.algorithm;

import com.noveogroup.device.Device;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by arty on 11.02.16.
 */
public class BubbleSort implements Algorithm {

    @Override
    public void sort(Device[] devices, boolean ascendingSort) {
        if (devices.length <= 1) {
            return;
        }

        Device tmp;
        for (int i = 0; i < devices.length; i++) {
            for (int j = 0; j < devices.length - 1; j++) {
                if (devices[j].compareTo(devices[j + 1]) > 0) {
                    tmp = devices[j];
                    devices[j] = devices[j + 1];
                    devices[j + 1] = tmp;
                }
            }
        }

        if (!ascendingSort) {
            Collections.reverse(Arrays.asList(devices));
        }
    }
}
