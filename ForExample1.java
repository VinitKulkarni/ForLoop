package com.bridgelabz.ForExamples;


//1. Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
public class ForExample1 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; i<=5; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
