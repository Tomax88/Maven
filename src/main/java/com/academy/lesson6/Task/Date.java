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
public class Date {
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public Date(int day,int month,int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public void printDate() {
        System.out.println("Дата " + day + "." + month + "." + year + " г.");
    }

    //разница между датами
    public void differenceIdDays(Date other){
        int range = (this.day + this.month*30+this.year*365)-(other.day+other.month*30+other.year*365);
        System.out.println("Количество дней между датами "+this.day +"."+ this.month+"."+this.year+"г. и "+other.day
                +"."+other.month+"."+other.year+"г.");
        System.out.println("Составляет " + range+" д.");

    }
}
