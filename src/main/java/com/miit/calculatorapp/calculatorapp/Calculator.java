package com.miit.calculatorapp.calculatorapp;

public class Calculator {
	
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
