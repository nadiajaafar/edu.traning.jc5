package edu.traning.les05;

import static java.lang.Math.pow;

public class Main12 {

    public static void main(String[] args) {

        int an = 1 ;
        long comp = 1L;

        for (int i =1;i<= 10; i++) {
           an = 6 + (an-1);
            comp = an * comp;
        }

        System.out.println("Произведение равно:"+ comp);






    }

    }

