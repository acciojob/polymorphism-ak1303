package com.driver;

public class Main {

    public static class Product{
        public int product(int x, int y){
            return 0;
        }
        public int product(int x, int y, int z){
            return 1;
        }
        public double product(double x, double y){
            return 0.0;
        }
    }
 public static void main(String[] args){
     Product p = new Product();
     p.product(1,2);
     p.product(3,4,5);
     p.product(1.0,2.0);
 }
}