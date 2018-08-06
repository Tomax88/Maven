package com.academy.lesson11.task1;

public class main {
    public static void main(String[] args) {
        try {
            Time timeSimple = new TimeImpl(12,23 ,40);
            timeSimple.setTime( 23,33,54 );
        }catch (Exception e) {
            System.out.println( "Error input time invalid" );
        }
    }
}
