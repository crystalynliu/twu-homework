package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("=========Easiest exercise ever=========");
        System.out.println("*");

        System.out.println("=========Draw a horizontal line=========");
        System.out.print("Please input a number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for(int i = 0; i < number; i++){
            System.out.print("*");
        }
        System.out.println();

        System.out.println("=========Draw a vertical line=========");
        for(int i = 0; i < number; i++){
            System.out.println("*");
        }

        System.out.println("=========Draw a right triangle=========");
        for(int i = 1; i <= number; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
