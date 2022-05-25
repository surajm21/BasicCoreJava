package com.bridglabz.basiccore;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        if(year>999 && year<10000){
            if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) {
                System.out.println("Given year is a leap year");
            }else {
                System.out.println("Given year is not a leap year");
            }
        }else {
            System.out.println("Please enter only Four digits Year");
        }
    }
}
