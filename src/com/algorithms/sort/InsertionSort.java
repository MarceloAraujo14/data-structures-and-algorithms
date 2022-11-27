package com.algorithms.sort;

import com.algorithms.Product;

import java.util.Arrays;

public class InsertionSort {

    public static void execute(Product[] products) {
        for (int current = 1; current < products.length; current++) { //Percorra cada elemento do array
            int analisys = current; // defina qual elemento está sendo analisado
            while (analisys > 0 && products[analisys].getPrice() < products[analisys - 1].getPrice()) { // enquanto o indice desse elemento for maior que zero e o valor dele for menor que o antecessor
                System.out.println("Switching: " + products[analisys -1 ].getBrand() + " <- " + products[analisys].getBrand());
                switchs(products, analisys, analisys - 1); // troque ele de lugar com o antecessor.
                analisys--; // caso isso ocorra, analise o index em que ele foi inserido com o antecessor a posição atual do elemento
            }
            System.out.println(Arrays.toString(products));
        }
    }
    private static void switchs(Product[] products, int current, int cheaper) {
        Product switcher = products[current];
        products[current] = products[cheaper];
        products[cheaper] = switcher;
    }

}
