package com.academy.lesson11.task1;

public class TimeImplSeconds implements Time {
    int s;

    @Override
    public void setTime(int h,int m,int s){
        this.s+= h*3600+m*60+s;
    }
    public void setTime(int seconds) {
        if(seconds>24*3600) {
            System.out.println("error");
            return;
        }

        this.s = seconds;
    }

    public int getHours(){
        return (int)s/3600;
    }
    public int getMinutes(){
        return  (int) (s%3600)/60;

    }
    public int getSeconds(){
        return  (int) s%60;

    }
    public String getTime(TimeFormat timeFormat) {
        //return "00:00:00";

        switch (timeFormat) {
            case HOUR_12:
                if (getHours() <= 12 && getHours() >= 0) {
                    String str1 = checkTime( getHours() , getMinutes() , getSeconds() );
                    str1 += "am";
                    System.out.println( str1 );

                    return str1;
                } else {
                    int h2 = getHours() - 12;

                    String str2 = checkTime( h2 , getMinutes() , getSeconds() );
                    str2 += "pm";

                    System.out.println( str2 );
                    return str2;
                }
            case HOUR_24:
                String str3 = checkTime( getHours() , getMinutes() , getSeconds() );
                //String str4 = str3.substring( 0 , str3.length() - 2 );
                System.out.println( str3 );

                return str3;
            default:
                return "Error";
        }
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
}
