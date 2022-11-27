package com.algorithms;

import com.algorithms.sort.InsertionSort;
import com.algorithms.sort.SelectionSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Product[] products = {
                new Product("Ferrari", 1500000d),
                new Product("Fusca", 10000d),
                new Product("Smart", 50000d),
                new Product("Jeep", 49000d),
                new Product("Porshe", 150000d),
        };


        System.out.println(Arrays.toString(products));
        System.out.println("Selection Sort:");
        SelectionSort.execute(products.clone());

        System.out.println("-------------------------");
        System.out.println("Insertion Sort:");
        InsertionSort.execute(products.clone());


    }
}
