package edu.traning.les05;

public class Main15 {

    public static void main(String[] args) {

        int  n = 2;
        int sum = 0;
        int result =1;

        for ( int i = 0 ; i <= 10;i++ ) {
            result = (int) Math.pow(n,i);
            sum+=result;

        }
        System.out.println(sum);

        }

}
