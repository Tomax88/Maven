package com.academy.lesson10.task1;

public class main {
    public static void main(String[] args) {
        Time timeSimple = new TimeImpl();
        Time timeSeconds = new TimeImplSeconds();
        timeSimple.setTime( 23,33,54 );
        timeSimple.getTime( TimeFormat.HOUR_12 );
        timeSimple.getTime( TimeFormat.HOUR_24 );

        timeSimple.setTime( 8,5,8 );
        timeSimple.getTime( TimeFormat.HOUR_12 );
        timeSimple.getTime( TimeFormat.HOUR_24 );

        ((TimeImplSeconds) timeSeconds).setTime( 50000 );
        timeSeconds.getTime( TimeFormat.HOUR_12 );
        timeSeconds.getTime( TimeFormat.HOUR_24 );

        ((TimeImplSeconds) timeSeconds).setTime( 30000 );
        timeSeconds.getTime( TimeFormat.HOUR_12 );
        timeSeconds.getTime( TimeFormat.HOUR_24 );
    }
}
