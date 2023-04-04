package com.bridgelabz.ForExamples;


//3. Write a Program to find Palindrome Number
public class ForExample3 {
    public static void main(String[] args) {
        int number = 113;
        int originalValue = number;
        int reminder = 0;
        int result = 0;

        for(int i=1; (number != 0); i++){
            reminder = number % 10;
            result = result * 10 + reminder;
            number = number / 10;
        }

        if (originalValue == result){
            System.out.println(originalValue + " is palindrome");
        }else {
            System.out.println(originalValue + " is not palindrome");
        }
    }
}
