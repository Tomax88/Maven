package com.academy.lesson14.Task2;
//Создайте блочное лямбда-выражение для вычисления факториала целого числа.
//        Продемонстрируйте его использование.
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

import static jdk.nashorn.internal.objects.NativeFunction.function;

public class task2 {
    public static void main(String[] args) {
        FactorialInt factorial = n -> {

            int fact = 1;

            for (int i = 1; i <= n; i++) {

                fact *= i;

            }
            return fact;

        };

        System.out.println("Factorial for number '10' = " + factorial.function(10));
    }

}

interface FactorialInt{
    int function(int n);
}
