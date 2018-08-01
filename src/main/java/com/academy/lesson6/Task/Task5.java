package com.academy.lesson6.Task;
//Создать класс Date, который имеет следующие поля:
//        - день
//        - месяц
//        - год
//
//        Все поля должны быть помечены модификатором private
//		- реализовать доступ к полям через методы set и get
//                -* реализовать статический метод checkData(int day, int month, int year), который проверяет существование введенной даты
//                -* использовать проверку checkData, при попытке изменить поле метод set, в случае ошибки не проводить изменение,
//                а вывести сообщение об ошибке на консоль
//                -** реализовать метод differenceIdDays(int day, int month, int year), который принимает другую дату и вычисляет разницу в
//                днях между датами
//                - протестировать работу методов
public class Task5 {
    public static void main(String[] args) {
        Date date1 = new Date(25, 10, 2015);
        Date date2 = new Date(10, 11, 1903);
        Date date3 = new Date(3, 9, 2001);
        date1.printDate();
        date2.printDate();
        date3.printDate();
        date1.differenceIdDays(date3);

    }
}
