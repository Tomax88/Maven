package com.academy.lesson11.task1;

public class TimeImpl implements Time {
    int h;
    int m;
    int s;

    @Override
    public void setTime(int hours , int minutes , int seconds) throws Exception {
        if(h>24 || m>60 || s>60){
            Exception e= new Exception();
            throw e;
        }
        this.h = hours;
        this.m = minutes;
        this.s = seconds;
    }
    TimeImpl(int hours , int minutes , int seconds) throws Exception {
        if(h>24 || m>60 || s>60){
            Exception e= new Exception();
            throw e;
        }
        this.h = hours;
        this.m = minutes;
        this.s = seconds;
    }

    public String checkTime(int h , int m , int s) {
        String time = "";
        if (h / 10 < 1) {
            time += "0";
            time += h;
        } else {
            time += h;
        }
        time += ":";
        if (m / 10 < 1) {
            time += "0";
            time += m;
        } else {
            time += m;
        }
        time += ":";
        if (s / 10 < 1) {
            time += "0";
            time += s;
        } else {
            time += s;
        }

        return time;
    }

    @Override
    public String getTime(TimeFormat timeFormat) {
        //return "00:00:00";

        switch (timeFormat) {
            case HOUR_12:
                if (h <= 12 && h >= 0) {
                    String str1 = checkTime( h , m , s );
                    str1+="am";
                    System.out.println( str1 );

                    return str1;
                } else {
                    int h2=h- 12;

                    String str2 = checkTime( h2 , m , s );
                    str2+="pm";

                    System.out.println( str2 );
                    return str2;
                }
            case HOUR_24:
                String str3 = checkTime( h , m , s );
                //String str4 = str3.substring( 0 , str3.length() - 2 );
                System.out.println( str3 );

                return str3;
            default:
                return "Error";
        }
    }
}