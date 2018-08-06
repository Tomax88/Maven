package com.academy.lesson11.task3;

import java.math.BigDecimal;
import java.util.Random;

public class ScientificCalculator implements ScientificOperations {
    public double Sum(double a , double b) {
        System.out.println( a + b );
        return a + b;
    }// сложение

    public double subtraction(double a , double b) {
        System.out.println( a - b );
        return a - b;
    }

    ;// вычитание

    public double multiplication(double a , double b) {
        System.out.println( a * b );
        return a * b;

    }

    ;// умножение

    public double division(double a , double b) throws Exception {
        if (b == 0) {
            Exception e = new Exception( "division by zero" );
            throw e;
        }
        System.out.println( a / b );
        return a / b;
    }// деление

    public double percent(double a , double b) {
        System.out.println( (a * b) / 100 );
        return (a * b) / 100;
    }// вычисление процента

    public double sqr(double a) throws Exception {
        if (a < 0) {
            Exception e = new Exception( "square root of negative number" );
            throw e;
        }
        System.out.println( Math.sqrt( a ) );
        return Math.sqrt( a );
    }// квадратный корень

    public double poweroftwo(double a) {
        System.out.println( Math.pow( a , 2 ) );
        return Math.pow( a , 2 );
    }// возведение в квадрат

    public double inverse(double a) throws Exception {
        if (a == 0) {
            Exception e = new Exception( "division by zero" );
            throw e;
        }
        System.out.println( 1 / a );
        return 1 / a;

    }// вычисление обратного числа
    public double sin (double a){
        System.out.println(Math.sin( a ));
        return Math.sin( a );
    }
    public double cos (double a){
        System.out.println(Math.cos( a ));
        return Math.cos( a );
    }
    public double tan (double a){
        System.out.println(Math.tan( a ));
        return Math.tan( a );

    }
    public double cat (double a){
        System.out.println(Math.atan( a ));
        return Math.atan( a );

    }
    public double log (double a) throws Exception {
        if (a < 0) {
            Exception e = new Exception( "log of negativ number" );
            throw e;
        }
        System.out.println(Math.log( a ));
        return Math.log( a );
    }

    public double pow (double a, double b){
        System.out.println(Math.pow(a, b ));
        return Math.pow(a, b );
        }


    public double factorial  (double a) throws Exception{
        if (a < 0) {
            Exception e = new Exception( "factorial of negativ number" );
            throw e;
        }
        double c=1;
        for (int i = 1; i <= a ; i++) {
            c*=i;
        }
        System.out.println(c);
        return c;


    }
    public double exp (double a) {
        System.out.println(Math.exp(a));
        return Math.exp(a);
    }
    public double random(){
        Random random = new Random( );

        return random.nextDouble()*1000;
    }//рандомизация
    public BigDecimal rounding(double a, int b) {
        BigDecimal big = new BigDecimal( a );
        System.out.println(big.setScale( b,BigDecimal.ROUND_CEILING ));
        return big.setScale( b,BigDecimal.ROUND_CEILING );

    }//округление
}


