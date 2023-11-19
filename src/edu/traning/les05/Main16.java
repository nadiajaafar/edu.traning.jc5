package edu.traning.les05;

public class Main16 {
    public static void main(String[] args) {

        int sum = 3;
        long product = sum;

        for (double i = 3; i <= 10; i++) {
            sum += i;
            product *= sum;

        }
        System.out.println(product);
    }
}
