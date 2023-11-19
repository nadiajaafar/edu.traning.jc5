package edu.traning.les05;

public class Main18 {
    public static void main(String[] args) {

        double e = 0.001;
        double sum = 0;

        for (double i = 1; i <= 100; i++) {
            double a = Math.pow(-1, i - 1) / i;
            if (Math.abs(a) >= e) {
                sum += a;
            }
        }

        System.out.println("Сумма равна " + sum);
    }
}
