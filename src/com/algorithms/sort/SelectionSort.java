package com.algorithms.sort;

import com.algorithms.Product;

import java.util.Arrays;

public class SelectionSort {

    public static void execute(Product[] products){
        for (int current = 0; current < products.length - 1; current++) {
            int cheaper = findCheaper(products, current, products.length);
            System.out.println("Switching: " + products[current].getBrand() + " <- " + products[cheaper].getBrand());
            switchs(products, current, cheaper);
            System.out.println(Arrays.toString(products));
        }

    }

    private static int findCheaper(Product[] products, int start, int end){
        int cheaper = start;
        for (int current = start; current < end; current++) {
            if(products[current].getPrice() < products[cheaper].getPrice()){
                cheaper = current;
            }
        }
        return cheaper;
    }

    private static void switchs(Product[] products, int current, int cheaper) {
        Product switcher = products[current];
        products[current] = products[cheaper];
        products[cheaper] = switcher;
    }


}
