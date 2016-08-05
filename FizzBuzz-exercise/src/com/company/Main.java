package com.company;

public class Main {

    public static void main(String[] args) {
        int keyNumbers[] = new int[]{3, 5};
        String keyWords[] = new String[]{"Fizz","Buzz"};

        for (int i = 1; i <= 100; i++) {
            String output = "";
            for(int j = 0 ; j < keyNumbers.length; j++){
                if(i%keyNumbers[j] == 0){
                    output += keyWords[j];
                }
            }
            output = output == "" ? Integer.toString(i) : output;
            System.out.println(output);
        }
    }
}
