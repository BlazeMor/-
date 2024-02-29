package ru.krista.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ведите выражение: ");
        String input = scanner.nextLine();
        scanner.close();

        int num1;
        int num2;
        int result = 0;
        char operation;

        String[] parts = input.split(" ");
        if (parts.length != 3) {
            System.out.println("Неверный формат ввода.");
            return;
        }

        try {
            num1 = Integer.parseInt(parts[0]);
            num2 = Integer.parseInt(parts[2]);

        } catch (NumberFormatException e) {
            System.out.println("Не удалось получить число из: " + input);
            return;
        }

        operation = parts[1].charAt(0);
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("На ноль делить нельзя!");
                    return;
                }
                break;
            default:
                System.out.println("Недопустимая операция!");
                return;
        }
      

        System.out.println("Результат: " + Integer.toString(result));
    }
}
