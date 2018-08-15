package com.academy.lesson14.Task1;
//Составьте лямбда-выражение, которое возвращает значение true, если
//        число принадлежит к диапазону чисел 10-20, включая граничные значения
import java.util.Arrays;
import java.util.function.BooleanSupplier;
import java.util.function.IntPredicate;

public class task1 {
    public static void main(String[] args) {

        int passArray[] = new int[20];

        for (int i = 0; i < passArray.length; i++) {
            passArray[i] = (int) (Math.random() * 19) + 1;
        }
        IntPredicate cheknumder = (n -> n > 10 && n < 20);
        for (int j = 0; j < passArray.length; j++) {
            System.out.println(passArray [j]  + ":" + cheknumder.test(passArray [j]) );
        }
        //    Вывод Strimom
        System.out.println("Вывод Strimom");
        Arrays.stream( passArray ).forEach( el->System.out.println(el  + ":" + cheknumder.test( el )));
    }

}
