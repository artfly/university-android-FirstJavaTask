package com.noveogroup.algorithm;

import com.noveogroup.device.Device;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by arty on 11.02.16.
 */
public class QuickSort implements Algorithm {

    private void quicksort(Device[] devices, int low, int high) {
        if (low < high) {
            int index = partition(devices, low, high);
            quicksort(devices, low, index);
            quicksort(devices, index + 1, high);
        }
    }

    private int partition(Device[] devices, int low, int high) {
        Device pivot = devices[low];
        int i = low - 1;
        int j = high + 1;
        while (true) {
            do {
                i++;
            }
            while (devices[i].compareTo(pivot) < 0);
            do {
                j--;
            }
            while (devices[j].compareTo(pivot) > 0);
            if (i >= j)
                return j;
            swap(devices, i, j);
        }
    }

    private void swap(Device[] devices, int i, int j) {
        Device tmp = devices[i];
        devices[i] = devices[j];
        devices[j] = tmp;
    }

    @Override
    public void sort(Device[] devices, boolean ascendingSort) {
        quicksort(devices, 0, devices.length - 1);
        if (!ascendingSort)
            Collections.reverse(Arrays.asList(devices));
    }
}
