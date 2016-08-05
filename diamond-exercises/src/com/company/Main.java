package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("please input a number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        printTriangle(number);
    }

    public static void printTriangle(int number){
        System.out.println("=======Isosceles Triangle=======");
        int length = number*2 - 1;
        for(int i = 1; i <= number; i++){
            int starNum = i*2 - 1;
            int spaceNum = (length - starNum)/2;
            circlePrintSpace(spaceNum);
            circlePrintStar(starNum);
            circlePrintSpace(spaceNum);
            System.out.println();
        }
    }

    public static void circlePrintSpace(int number){
        for(int i = 0; i < number; i++){
            System.out.print(" ");
        }
    }

    public static void circlePrintStar(int number){
        for(int i = 0; i < number; i++){
            System.out.print("*");
        }
    }
}
