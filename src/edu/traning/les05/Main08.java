package edu.traning.les05;

public class Main08 {

    public static void main(String[] args) {
        int a = 6;
        int b = 10;
        int h = 1;
        int c = 2;
        int y = 0;

        for (int i = a; i <= b; i += h) {
            if (i == 15); {
                y = (i + c) * 2;
            } if (i != 15); {
                y = (i - c) + 6;
            }
            System.out.println("При х = " + i + " у = " + y);
        }

    }
}
