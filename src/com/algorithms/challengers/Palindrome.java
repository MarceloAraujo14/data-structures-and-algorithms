package com.algorithms.challengers;

import java.util.Arrays;
import java.util.Objects;

public class Palindrome {
    public static void main(String[] args) {
        String s = "000110";
         String[] split = s.split("");
        int[] array = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            array[i] = Integer.parseInt(split[i]);
        }
        int length = array.length-1;
        int indiceAtual = 0;
        int count = 0;
        if(isPalindrome(array)){
            System.out.println("Original: " + Arrays.toString(array));
            while (indiceAtual < length) {
                if (reachMiddle(array.length, indiceAtual)) {
                    break;
                }
                int indiceComparado = indiceAtual;
                while (array[indiceAtual] != (array[length-indiceComparado])){
                    indiceComparado++;
                }
                if(Objects.equals(array[indiceAtual], array[length - indiceAtual])){
                    indiceAtual++;
                    continue;
                }
                count += switchs(array, length, indiceComparado);
            }
            System.out.println("Final: " + Arrays.toString(array));
            System.out.println("Count: " + count);
        } else {
            System.out.println("Cannot be a palindrome");
        }

    }

    private static int switchs(int[] array, int length, int indiceComparado) {
        int switcher = array[length - indiceComparado +1];
        array[length - indiceComparado +1] = array[length - indiceComparado];
        array[length - indiceComparado] = switcher;
        System.out.println("Switching: " + (length - indiceComparado) + " x " + (length-indiceComparado +1));
        System.out.println("Switching: " + Arrays.toString(array));
        return 1;
    }

    private static boolean reachMiddle(int length, int index){
        return (length % 2 != 0 && length/2 == index) || (length % 2 == 0 && length/2 -1 == index);
    }

    private static boolean isPalindrome(int[] array){
        int i = 0;
        for (int number: array) {
            i += number == 1 ? 1 : 0;
        }
        return array.length % 2 != 0 || i % 2 == 0;
    }
}
