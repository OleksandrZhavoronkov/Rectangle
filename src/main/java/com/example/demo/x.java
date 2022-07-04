package com.example.demo;

public class x {
    public static void main(String[] args) {

        int x = 0;
        while (x < 10) {
            if (x == 0 || x == 9) {
                int c = 0;
                while (c < 20){
                    System.out.print("v");
                    c++;
                }
                System.out.println();
                x++;
            } else {
                int n = 0;
                while (n < 20) {
                    if (n == 0 || n == 19) {
                        System.out.print("v");
                        n++;
                    } else {
                        System.out.print(" ");
                        n++;
                    }
                }
                System.out.println();
                x++;
            }
        }
    }
}
