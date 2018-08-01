package com.academy.lesson7.DZ;


import com.academy.lesson7.DZ.Data;

public class Task1 {
    public static void main(String[] args) {
        Data date1 = new Data(2015, 6, 20);
        Data date2 = new Data(2014, 5, 28);
        Data date3 = new Data(2015, 6, 20);

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(date1.equals(date3));
        System.out.println(date2.equals(date3));

        DataTime dateTime1 = new DataTime(2014,11,8,14,51,42);
        DataTime dateTime2 = new DataTime(2013,9,28,18,7,30);
        DataTime dateTime3 = new DataTime(2014,11,8,14,51,42);

        System.out.println(dateTime1);
        System.out.println(dateTime2);
        System.out.println(dateTime3);
        System.out.println(dateTime1.equals(dateTime2));
        System.out.println(dateTime1.equals(dateTime3));
        System.out.println(dateTime1.checkTime(50,70,66));
        dateTime1.printTime();




    }
}

