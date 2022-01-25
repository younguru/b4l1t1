package ru.netology.jd13;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        // возможно деление на 0
        int c = calc.devide2.apply(a, b);
        calc.println.accept(c);
    }
}
