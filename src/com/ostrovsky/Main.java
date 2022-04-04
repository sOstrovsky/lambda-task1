package com.ostrovsky;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        /*
        в варианте из задания нет проверки на то, что делитель не может быть равен 0
        в моей имплементации в случае деления на 0 вернется 0
        */
        int c = calc.divide.apply(a, b);
        calc.println.accept(c);
    }
}
