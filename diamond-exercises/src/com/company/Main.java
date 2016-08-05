package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.print("please input a number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        printTriangle(number);
        printDiamond(number);
    }

    public static void printTriangle(int number) {
        System.out.println("=======Isosceles Triangle=======");
        int length = number * 2 - 1;
        for (int i = 1; i <= number; i++) {
            PrintStarLine(length, i);
        }
    }

    public static void printDiamond(int number) {
        System.out.println("=======Diamond=======");
        int length = number * 2 - 1;
        for (int i = 1; i <= number; i++) {
            PrintStarLine(length, i);
        }
        for (int i = number - 1; i > 0; i--){
            PrintStarLine(length, i);
        }
    }

    public static void PrintStarLine(int length, int index) {
        int starNum = index * 2 - 1;
        int spaceNum = (length - starNum) / 2;
        for (int j = 0; j < spaceNum; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < starNum; j++) {
            System.out.print("*");
        }
        for (int j = 0; j < spaceNum; j++) {
            System.out.print(" ");
        }
        System.out.println();
    }
}
