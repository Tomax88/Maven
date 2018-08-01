package com.academy.lesson8;

import static com.academy.lesson8.Season.AUTUMN;
import static com.academy.lesson8.Season.WINTER;

public class DemoEnum {
    public static void main(String[] args) {
        System.out.println(WINTER == AUTUMN);
        System.out.println(WINTER == WINTER);
    }
}
