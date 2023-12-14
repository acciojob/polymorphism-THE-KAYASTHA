package com.driver;



import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        int m = 6;
        int n = 5;
        int o = 4;
        Product p = new Product();
        int a = p.product(m, n);
        int b = p.product(m, n, o);
        double c = p.product( 2.0, 5.0);
        System.out.print(a + " " + b + " " + c);

    }

    public static class Product {


        public int product(int x, int y) {
            return (x * y);


        }

        public int product(int x, int y, int z) {
            return (x * y * z);
        }

        public double product(double x, double y) {
            return (x * y);
        }


    }
}