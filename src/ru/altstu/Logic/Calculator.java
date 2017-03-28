package ru.altstu.Logic;

/**
 * Created by sergey on 27/03/2017.
 */
public class Calculator {

    public Calculator() {}

    /**
     * Метод, складывающий два double значения
     * @param a - первый аргумент, любое вещестенное число
     * @param b - второй аргумент, любое вещестенное число
     * @return результат складывания двух аргументов
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Метод, умножающий два double значения
     * @param a первый аргумент, любое вещестенное число
     * @param b второй аргумент, любое вещестенное число
     * @return результат умножения двух аргументов
     */
    public double multiply(double a, double b) {
       return a * b;
    }
}
