package edu.traning.les05;

public class Main19 {
    public static void main(String[] args) {

        double e = 0.001;
        double sum = 0;

        for (double i = 1; i <= 100; i++) {
            double a = ((1 / Math.pow(2, i)) + (1 / Math.pow(3, i)));
            if (Math.abs(a) >= e) {
                sum += a;
            }
        }

        System.out.println("Сумма равна " + sum);
    }
}
