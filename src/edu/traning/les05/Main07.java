package edu.traning.les05;

public class Main07 {

    public static void main(String[] args) {
        int a = 6;
        int b = 10;
        int h = 1;
        int y;

        for (int i = a; i <= b; i += h) {
            if (i > 2) {
                y = i;
            } else {
                y = i * (-1);
            }
            System.out.println("При х = " + i + " у = " + y);
        }

    }

}

