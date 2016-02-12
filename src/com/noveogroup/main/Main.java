package com.noveogroup.main;

import com.noveogroup.algorithm.Algorithm;
import com.noveogroup.algorithm.BubbleSort;
import com.noveogroup.algorithm.InsertionSort;
import com.noveogroup.algorithm.QuickSort;
import com.noveogroup.device.*;
import java.util.*;



public class Main {

    private static void sort(Algorithm algorithm, Device[] devices, boolean ascending) {
        algorithm.sort(devices, ascending);
        System.out.println();
        Arrays.asList(devices).forEach(System.out::println);
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Device[] devices = new Device[9];
        for (int i = 0; i < devices.length / 3; i++) {
            devices[i] = new Phone(rand.nextInt(Integer.MAX_VALUE));
            devices[i + devices.length / 3] = new Tablet(rand.nextInt(Integer.MAX_VALUE));
            devices[i + (devices.length * 2) / 3] = new Laptop(rand.nextInt(Integer.MAX_VALUE));
        }

        Algorithm algorithm = new InsertionSort();
        sort(algorithm, devices, true);
        algorithm = new QuickSort();
        sort(algorithm, devices, false);
        algorithm = new InsertionSort();
        sort(algorithm, devices, true);
    }
}
