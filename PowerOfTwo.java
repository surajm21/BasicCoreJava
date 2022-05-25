package com.bridglabz.basiccore;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int R = sc.nextInt();
        for(int i = 1; i <= R; i++) {
            R = R* 2;
            System.out.println(R);
        }
    }
}
