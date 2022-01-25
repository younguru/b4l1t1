package ru.netology.jd13;

import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    // нет проверки второго оператора на 0
    BinaryOperator<Integer> devide = (x, y) -> x / y;
    // как вариант, можно просто вернуть 0, если y = 0
    BinaryOperator<Integer> devide2 = (x, y) -> y == 0 ? 0 : x / y;
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;
}
