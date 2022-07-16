package com.miit.calculatorapp.calculatorapp;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean bool = true;
        while (bool) {

            System.out.println("You need to enter two numbers for calculation");

            Scanner scan = new Scanner(System.in);

            System.out.println("Enter the first number:");
            int num1 = scan.nextInt();

            System.out.println("Enter the second number:");
            int num2 = scan.nextInt();

            System.out.println("Enter 1 for addition, 2 for subtraction, 3 for multiplication and 4 for division");
            int calc = scan.nextInt();

            switch (calc) {
                case 1:
                    System.out.println("Addition of two numbers is: ");
                    System.out.println(Calculator.addition(num1, num2));
                    break;

                case 2:
                    System.out.println("Subtraction of two numbers is: ");
                    System.out.println(Calculator.subtraction(num1, num2));
                    break;

                case 3:
                    System.out.println("Multiplication of two numbers is: ");
                    System.out.println(Calculator.multiplication(num1, num2));
                    break;

                case 4:
                    System.out.println("Division of two numbers is: ");
                    System.out.println(Calculator.division(num1, num2));
                    break;

                default:
                    System.out.println("Invalid input! Try again.");

                    break;
            }

            System.out.println("Would you like to do another calculation? (Y/N)");
            char ans = scan.next().charAt(0);

            if (ans == 'y') {
                bool = true;
            } else {
                bool = false;
            }

        }

    }

    
    
}




