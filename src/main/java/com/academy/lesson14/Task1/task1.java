package com.academy.lesson14.Task1;
//Составьте лямбда-выражение, которое возвращает значение true, если
//        число принадлежит к диапазону чисел 10-20, включая граничные значения

import java.awt.*;
import java.util.function.BooleanSupplier;
import java.util.function.Predicate;
import java.util.*;

public class task1 {
    public static void main(String[] args) {

        int passArray[] = new int[20];

        for (int i = 10; i < passArray.length; i++) {
            passArray[i] = i;
            System.out.println( Integer.toString( (int) (Math.random() * 19) + 1 ) );
        }
        for (int i : passArray) {
            BooleanSupplier booleanSupplier = () -> {

                if (i > 10 && i < 20) {
                    System.out.println( i + "true" );
                    return false;
                }
                System.out.println( i + "false" );

                return true;
            };
            System.out.println(booleanSupplier.getAsBoolean());

        }

    }
}
