package generics.CalculatorWithUsingGenerics;

import java.util.Scanner;

public class CalculatorWithUsingGenerics {
    public static <T extends Number> double sum(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number> double subtraction(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }

    public static <T extends Number> double multiply(T a, T b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number> double divide(T a, T b) {
        if (b.doubleValue() == 0.0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a.doubleValue() / b.doubleValue();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        String firstOperand = scanner.nextLine();
        System.out.print("Введите второе число: ");
        String secondOperand = scanner.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Введите тип переменной (Integer/Double): ");
        String type = scanner2.nextLine();

        try {
            if (type.equalsIgnoreCase("Integer")) {
                Integer intFirstOperand = Integer.parseInt(firstOperand);
                Integer intSecondOperand = Integer.parseInt(secondOperand);
                System.out.println("Sum (int): (" + intFirstOperand.getClass().getSimpleName() + ") " + sum(intFirstOperand, intSecondOperand));
                System.out.println("Subtraction (int): (" + intFirstOperand.getClass().getSimpleName() + ") " + subtraction(intFirstOperand, intSecondOperand));
                System.out.println("Multiply (int): (" + intFirstOperand.getClass().getSimpleName() + ") " + multiply(intFirstOperand, intSecondOperand));
                try {
                    System.out.println("Divide (int): (" + intFirstOperand.getClass().getSimpleName() + ") " + divide(intFirstOperand, intSecondOperand));
                } catch (ArithmeticException e) {
                    System.out.println("Divide (int): (" + intFirstOperand.getClass().getSimpleName() + ") " + "деление на 0 запрещено");
                }
            } else {
                Double doubleFirstOperand = Double.parseDouble(firstOperand);
                Double doubleSecondOperand = Double.parseDouble(secondOperand);
                System.out.println("Divide (double): (" + doubleFirstOperand.getClass().getSimpleName() + ") " + divide(doubleFirstOperand, doubleSecondOperand));
                System.out.println("Sum (double): (" + doubleFirstOperand.getClass().getSimpleName() + ") " + sum(doubleFirstOperand, doubleSecondOperand));
                try {
                    System.out.println("Multiply (double): (" + doubleFirstOperand.getClass().getSimpleName() + ") " + multiply(doubleFirstOperand, doubleSecondOperand));
                } catch (ArithmeticException e) {
                    System.out.println("Multiply (double): (" + doubleFirstOperand.getClass().getSimpleName() + ") " + "деление на 0 запрещено");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Операции над строками запрещены");
        }
    }
}
