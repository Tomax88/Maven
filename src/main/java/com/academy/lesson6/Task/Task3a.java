package com.academy.lesson6.Task;
////3а) Класс Currency для работы с денежными суммами.
//        - Класс должен быть представлен двумя private полями:
//        double value; для хранения значания суммы
//        String name; для хранения названия валюты ("грн", "руб", "$")
//        Реализовать 2 конструктора:
//        - без параметров
//        - и с двумя параметрами, которые принимает (double value, String name);
//        - конструктор копирования: (Currency currency)
//        - Реализовать метод отображения суммы на экран print();
//        Напр. в виде: 154.65руб // отображать не более 2 знаков после запятой
//        - Реализовать операцию сравнения:
//        boolean isEqual(Currency currency); // вернет true, если и значение и строка - совпадают
//        - Реализовать методы:
//        void add(double value, String name); // метод сложения
//        (если name отличается от текущего поля 'name', то сложение не производить,
//        а вывести сообщение об ошибке ("Error: currency names are differ 'грн' - 'руб')
//        void add(Currency currency); // метод сложения
//        void substract(double value, String name); // метод вычитания ...
//        void substract(Currency currency);
//        void divide(double factor); // деление суммы на число
//        void multiply(double factor); // умножение суммы на число

public class Task3a {
    public static void main(String[] args) {
        Currency cur1 = new Currency(100, "руб");
        Currency cur2 = new Currency(30, "руб");
        Currency cur3 = new Currency(150, "руб");
        Currency cur4 = new Currency(10, "$");
        Currency cur5 = new Currency(4, "руб");
        cur1.printCur();
        cur2.printCur();
        cur3.printCur();
        cur4.printCur();
        cur1.addCurrenc(cur2);
        cur1.addCurrenc(cur4);
        cur1.substrCurrenc(cur2);
        cur3.divCurrenc(cur2);
        cur1.multCurrenc(cur5);

    }
}