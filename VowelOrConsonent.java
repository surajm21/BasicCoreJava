package com.bridglabz.basiccore;
import java.util.Scanner;
public class VowelOrConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Alphabet: ");
        char a = sc.next().charAt(0);
        if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u') {
            System.out.println(a+" is vowel");
        }else {
            System.out.println(a+" is consonent");
        }
    }
}
