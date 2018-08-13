package com.academy.lesson14.Task3;
//Создайте лямбда-выражение, которое переводит строку в верхний режим.
//        Перевести строку в верхний регистр с помощью лямбда-выражения.
//        Перевести строку в верхний регистр с помощью ссылки на метод.
import java.util.function.Function;
public class task3 {
    public static void main(String[] args) {
        SetToUpperCase setUp = str ->  str.toUpperCase();
        System.out.println(setUp.function("Перевести строку в верхний регистр с помощью лямбда-выражения."));//Перевести строку в верхний регистр с помощью лямбда-выражения.

        System.out.println(actionWithString("Перевести строку в верхний регистр с помощью ссылки на метод.", String :: toUpperCase));  //Перевести строку в верхний регистр с помощью ссылки на метод
    }

    private static String actionWithString(String str, Function<String, String> action) {
        return action.apply(str);
    }
}

interface SetToUpperCase{

    String function(String str);
}

