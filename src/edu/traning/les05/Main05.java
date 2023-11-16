package edu.traning.les05;

public class Main05 {

    public static void main(String[] args) {

        int x;
        int y;
        int sum;
        x = 1;
        y = 99;
        sum = 0;
        while (x <= y) {
            sum = sum + x;
            x += 2;

            x++;
        }
        System.out.println("sum = " + sum);

    }
}
