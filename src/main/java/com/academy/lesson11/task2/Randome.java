package com.academy.lesson11.task2;
import java.math.BigDecimal;
import java.util.Random;
import java.util.Arrays;
public class Randome {
    public static void main(String[] args) {
        BigDecimal[] mas = new BigDecimal[15];
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            mas[i]=new BigDecimal( random.nextFloat());
        }
        System.out.println(Arrays.toString( mas ));
        System.out.print("[");
        for (int i = 0; i < 15; i++) {
            System.out.print(mas[i].setScale( 3,BigDecimal.ROUND_CEILING ));
            if(i!=14)
            System.out.print(", ");
        }
        System.out.print("]");

    }
}
