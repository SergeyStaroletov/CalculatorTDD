package ru.altstu;

import ru.altstu.Logic.Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Calculator calculator = new Calculator();

        while (true) {
            System.out.println("Введите операцию (*/+), пустая строка - выход");
            String operation = br.readLine();
            if (operation.isEmpty()) break;
            System.out.println("Введите первый аргумент");
            String firtOperand = br.readLine();
            System.out.println("Введите второй аргумент");
            String secondOperand = br.readLine();

            switch (operation) {
                case "+":  System.out.println("Результат сложения :" +
                        String.valueOf(calculator.add(Double.parseDouble(firtOperand), Double.parseDouble(secondOperand))));
                break;
                case "*":  System.out.println("Результат умножения :" +
                        String.valueOf(calculator.multiply(Double.parseDouble(firtOperand), Double.parseDouble(secondOperand))));
                    break;
                default: System.out.println("Неподдерживаемая операция");
            }
        }
    }
}
