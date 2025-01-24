package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Calculator!");
        System.out.println("Enter first number:");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter second number:");
        double secondNumber = scanner.nextDouble();

        System.out.println("Choose operation: +, -, *, /");
        char operation = scanner.next().charAt(0);

        double result;
        switch (operation) {
            case '+':
                result = calculator.add(firstNumber, secondNumber);
                break;
            case '-':
                result = calculator.subtract(firstNumber, secondNumber);
                break;
            case '*':
                result = calculator.multiply(firstNumber, secondNumber);
                break;
            case '/':
                try {
                    result = calculator.divide(firstNumber, secondNumber);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation selected.");
                return;
        }

        System.out.printf("Result: %.2f %c %.2f = %.2f%n", firstNumber, operation, secondNumber, result);
    }
}