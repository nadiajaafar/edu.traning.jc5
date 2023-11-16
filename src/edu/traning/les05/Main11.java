package edu.traning.les05;

import static java.lang.Math.pow;

public class Main11 {

    public static void main(String[] args) {


        int difference = 0;

        for (int i = 1; i <= 200; i++) {

            difference -= (int) pow(i, 3);

        }

        System.out.println(difference);
    }
}

