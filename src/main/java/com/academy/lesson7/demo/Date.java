package com.academy.lesson7.demo;
import java.util.Objects;
public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return year +
                "." + month +
                "." + day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Date date = (Date) o;
        return year == date.year &&
                month == date.month &&
                day == date.day;
    }

    @Override
    public int hashCode() {

        return Objects.hash(year, month, day);
    }
    public boolean isLeap (){
//   4 true
//    100 not true
//    400 true
//    return false;
//    if (this.year % 4 == 0 && this.year % 400 == 0)
//        return true;
//    else
//        return false;
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
            return true;
        else
            return false;
    }
}
