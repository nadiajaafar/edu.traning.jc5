package edu.traning.les05;

import static java.lang.Math.pow;

public class Main09 {

    public static void main(String[] args) {

        int sum = 0 ;

        for (int i = 1; i <= 100; i++) {

            sum = (int) pow (i,2) + sum;


        }

        System.out.println(sum);
    }




}
