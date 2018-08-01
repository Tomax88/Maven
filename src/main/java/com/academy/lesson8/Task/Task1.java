package com.academy.lesson8.Task;
//1)  Перечисление для представления дней недели
//        Реализовать перечисление "День недели"
//        В перечислении "День недели" добавить функции получения дня "позавчера" и "послезавтра".
//        Протестировать перечисление в функции main() тестового класса.

public class Task1 {
    private enum Day {
        Sunday,
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday;
        public void Pozav4era(){
            System.out.println(values()[(ordinal()-2)]);
        }
        public void Poslezavtra(){
            System.out.println(values()[(ordinal()+2)]);
        }

    }
    private Day day;
    public void SetDay(String a){
        day = Day.valueOf(a);
    }
    public Task1() {
        day = Day.valueOf("Sunday");
    }
    public void Poslezavtra(){
        day.Poslezavtra();
    }
    public void Pozav4era(){
        day.Pozav4era();
    }

    public static void main(String[] args) {
        Task1 day = new Task1();
        day.SetDay( "Wednesday");
        day.Poslezavtra();
        day.Pozav4era();
    }


}

