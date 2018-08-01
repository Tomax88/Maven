package com.academy.lesson6.Task;
// Реализовать класс Abonent, который имеет поля:
//         long id; // необязательное поле, по умолчанию -1
//         String firstName;
//         String lastName;
//         int age;
//         char gender; // 'm' - male, 'f' - female
//
//         Все поля должны быть помечены модификатором private
//		- реализовать доступ к полям через методы set и get
//                - реализовать возможность создания класса через два конструктора:
//                1-> все поля, без обязательного поля "id"
//                2-> полный конструктор со всем полями
//
//                - реализовать метод void print(); вывода информации абонента в отформатированном виде
//                - реализовать метод boolean isEquals(Abonent abonent); // вернут true, если id обоих объектов равны и не равны -1, false - в остальных случаях
//                - протестировать метод isEquals
public class Task4 {
    public static void main(String[] args) {
        Abonent abon1 = new Abonent("Иванов","Иван",25,"M");
        Abonent abon2 = new Abonent(4502,"Сидоров","Сидор",37,"F");
        Abonent abon3 = new Abonent(3375,"Петров","Петр",49,"M");
        abon1.printInf();
        abon2.printInf();
        abon3.printInf();
        System.out.println(abon2.isEqual(abon3));
        System.out.println(abon1.isEqual(abon2));
        System.out.println(abon2.isEqual(abon2));
    }
}
