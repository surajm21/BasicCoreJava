package com.bridglabz.basiccore;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();

        for(int i = 2; i < a; i++) {
            while(a%i == 0) {
                System.out.println(i+" ");
                a = a/i;
            }
        }
        if(a>2) {
            System.out.println(a);
        }
    }

}
