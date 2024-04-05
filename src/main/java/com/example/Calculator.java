package com.example;

public class Calculator 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello! This is the main of the calculator class!" );
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    public double power(double a, double b) {
        return Math.pow(a, b);
    }

}
