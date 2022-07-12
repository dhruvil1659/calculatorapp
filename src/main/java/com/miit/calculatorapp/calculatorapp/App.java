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

            System.out.println("Enter 0 for addition, 1 for subtraction, 2 for multiplication and 3 for division");
            int calc = scan.nextInt();

            switch (calc) {
                case 0:
                    System.out.println("Addition of two numbers is: ");
                    System.out.println(addition(num1, num2));
                    break;

                case 1:
                    System.out.println("Subtraction of two numbers is: ");
                    System.out.println(subtraction(num1, num2));
                    break;

                case 2:
                    System.out.println("Multiplication of two numbers is: ");
                    System.out.println(multiplication(num1, num2));
                    break;

                case 3:
                    System.out.println("Division of two numbers is: ");
                    System.out.println(division(num1, num2));
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

    public static int addition(int num1, int num2) {

        int add_result = num1 + num2;

        return add_result;
    }

    public static int subtraction(int num1, int num2) {

        int sub_result = num1 - num2;

        return sub_result;
    }

    public static int multiplication(int num1, int num2) {

        int multi_result = num1 * num2;

        return multi_result;
    }

    public static float division(int num1, int num2) {
    	
    	float div_result = (float) num1 / num2;
        return div_result;
    }

}
