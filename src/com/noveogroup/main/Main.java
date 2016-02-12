package com.noveogroup.main;

import com.noveogroup.algorithm.Algorithm;
import com.noveogroup.algorithm.BubbleSort;
import com.noveogroup.algorithm.InsertionSort;
import com.noveogroup.algorithm.QuickSort;
import com.noveogroup.device.*;

import java.util.*;



public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Device[] devices = new Device[10];
        for (int i = 0; i < devices.length; i++) {
            devices[i] = new Phone(rand.nextInt(100));
        }

        Algorithm algorithm = new InsertionSort();
        Thread[] threads = new Thread[100];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new SortThread(devices, algorithm));
            threads[i].start();
        }

        try {
            for (Thread thread : threads)
                thread.join();
        } catch (InterruptedException e) {

        }

        Arrays.asList(devices).forEach(System.out::println);
    }
}
