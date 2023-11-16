package edu.traning.les05;

import static java.lang.Math.pow;

public class Main10 {

    public static void main(String[] args) {

        int sum = 0;

        int product = 0;

        for (int i = 1; i <= 200; i++) {

            sum = (int) pow(i, 2);

            product = sum * sum;
        }

        System.out.println(product);
    }
}
//    Составить программу нахождения произведения квадратов первых двухсот чисел.
