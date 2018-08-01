package com.academy.lesson7.DZ;

import java.util.Objects;

public class Data {
    private int year;
    private int mouth;
    private int day;

    public Data(int year , int mouth , int day) {
        this.year = year;
        this.mouth = mouth;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMouth() {
        return mouth;
    }

    public void setMouth(int mouth) {
        this.mouth = mouth;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void prin() {
        System.out.println( this.day + " " + this.mouth + " " + this.year );
    }

    @Override
    public String toString() {
        return "Data " + day +
                "." + mouth +
                "." + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return year == data.year &&
                mouth == data.mouth &&
                day == data.day;
    }

    @Override
    public int hashCode() {

        return Objects.hash( year , mouth , day );
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
