package com.company;

import java.util.*;
//import.java.lang.string;



public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter a number");

        Scanner scanner = new Scanner(System.in);


        double input1 = scanner.nextDouble();

        double operand1 = input1;


        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Please enter a second number");

        String input2 = scanner2.next();

        double operand2 = Double.parseDouble(input2);


        double sum = operand1 + operand2;
        double subtraction = operand1 - operand2;
        double division = operand1 / operand2;
        double multiplication = operand1 * operand2;
        double remainder = operand1 % operand2;

        showResults(sum, subtraction, division, multiplication, remainder);
    }

        public static void showResults (double sum, double subtraction, double division, double multiplication, double remainder){

            System.out.println("The sum is " + sum);
            System.out.println("The difference is " + subtraction);
            System.out.println("The quotient is " + division);
            System.out.println("The answer to the multiplication problem is " + multiplication);
            System.out.println("The answer to the remainder problem is " + remainder);

    }










    }

