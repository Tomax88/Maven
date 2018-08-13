package com.academy.lesson14.Task5;
//Создайте лямбда-выражение, которое удаляет все пробелы из заданной строки и возвращает результат.
//        Продемонстрируйте работу лямбда-выражения.
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
public class task5 {
    public static void main(String[] args) {

        String text = "Создайте лямбда-выражение, которое удаляет все пробелы из заданной строки и возвращает результат.";
        System.out.println("Initial String: " + text);

        RemoveSpaces rs = str -> str.replace(" ", "");

        String result = rs.function(text);
        System.out.println("String without spaces: " + result);
    }
}

interface RemoveSpaces{

    String function(String str);
}
