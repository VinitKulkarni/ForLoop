package com.bridgelabz.ForExamples;


//2. Write a Program to reverse the integer number eg. Input n=231 reverse is 132
public class ForExample2 {
    public static void main(String[] args) {
        int number = 132;
        int reminder = 0;
        int result = 0;

        System.out.println("original value = " +number);

        for(int i=1; (number != 0); i++){
            reminder = number % 10;
            result = result * 10 + reminder;
            number = number / 10;
        }

        System.out.println("reversed value = " +result);
    }
}
