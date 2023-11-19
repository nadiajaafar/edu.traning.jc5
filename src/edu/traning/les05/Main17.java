package edu.traning.les05;

public class Main17 {

    public static void main(String[] args) {
        int n = 9;
        double a = 1.1;
        double composition = 1;

        for (int i = 0; i < n; i++) {
            composition *= a + i;
        }

        System.out.println(composition);

    }

}