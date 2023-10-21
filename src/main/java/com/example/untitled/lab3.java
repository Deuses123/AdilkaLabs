package com.example.untitled;
public class lab3 {


    public static void main(String[] args) {
        double x = 0.5; //-1<=x<1

        //Скока хочешь
        int nTerms = 10;


        double result = calculateS(x, nTerms);
        System.out.println("Приближенное значение S: " + result);
    }

    public static double calculateAn(double x, int n) {
        return ((Math.pow(-1, n+1) + Math.pow(x, 2*n+1)) / (4 * Math.pow(n, 2) - 1));
    }

    public static double calculateS(double x, int nTerms) {
        double S = x;
        for (int n = 1; n <= nTerms; n++) {
            S += 2 * calculateAn(x, n);
        }
        return S;
    }


}