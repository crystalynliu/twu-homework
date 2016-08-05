package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    System.out.print("please input a number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String output = "";

        for(int i = 2; i <= number; i++){
            while (number != i){
                if(number % i !=0 ){
                    break;
                }
                output += Integer.toString(i) + ",";
                number = number / i;
            }
        }
        output += number==1 ? "" : Integer.toString(number);
        System.out.println(output);
    }
}
