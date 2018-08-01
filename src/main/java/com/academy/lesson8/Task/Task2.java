package com.academy.lesson8.Task;
//2) Перечисление для представления сезона*
//        Создать перечисление "Сезон".
//        Описать метод получения предыдущего и последующего сезона.
//        Протестировать перечисление в функции main() тестового класса.


public class Task2 {
    private enum Sezon {
        Winter,
        Spring,
        Summer,
        Outem;

        public void Before() {
            System.out.println( values()[(ordinal() - 1)] );
        }

        public void Next() {
            System.out.println( values()[(ordinal() + 1)] );
        }
    }

    private Sezon sezon;

    public void SetSezon(String a) {
        sezon = Sezon.valueOf( a );
    }

    Task2() {
        sezon = Sezon.valueOf( "Winter" );
    }

    public void Next() {
        sezon.Next();
    }

    public void Before() {
        sezon.Before();
    }

    public static void main(String[] args) {
        Task2 sezon = new Task2();
        sezon.SetSezon( "Summer" );
        sezon.Next();
        sezon.Before();
    }
}


