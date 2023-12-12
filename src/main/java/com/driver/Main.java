package com.driver;



import java.util.Scanner;

public class Main {
  Scanner in =new Scanner(System.in);
    int m=in.nextInt();
    int n=in.nextInt();
    int o=in.nextInt();
    Product p=new Product();
    int a=p.Product(m,n);
    int b=p.Product(m,n,o);
    double c=p.Product((double)m,(double)n);


}
class Product{



    public int Product(int x, int y){
        return (x*y);


    }
    public int Product(int x,int y,int z){
        return (x*y*z);
    }

    public double Product(double x,double y){
            return (x*y);
    }



}