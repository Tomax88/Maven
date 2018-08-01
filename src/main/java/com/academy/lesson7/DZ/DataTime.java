package com.academy.lesson7.DZ;

import java.util.Objects;


public class DataTime extends Data {
    private int hour;
    private int minute;
    private int second;

    public DataTime(int year , int mouth , int day , int hour , int minute , int second) {
        super( year , mouth , day );
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }


    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return super.toString() + " " + hour + "." + minute + "." + second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals( o )) return false;
        DataTime dataTime = (DataTime) o;
        return hour == dataTime.hour &&
                minute == dataTime.minute &&
                second == dataTime.second;
    }

    @Override
    public int hashCode() {

        return Objects.hash( super.hashCode() , hour , minute , second );
    }

    public boolean checkTime(int hour , int minute , int second) {
        if (second >= 0 && second <= 60) {
            this.second = second;
        } else return false;
        if (minute >= 0 && minute <= 60) {
            this.minute = minute;
        } else return false;
        if (hour >= 0 && hour <= 24) {
            this.hour = hour;
        } else return false;
        return true;
    }

    public void printTime() {
        System.out.print( "Time " + hour + ":" + minute + ":" + second );
    }


}


