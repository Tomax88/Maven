package com.academy.lesson11.task3;

public class main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.Sum( 2,2 );
        calc.subtraction(5,3);
        calc.multiplication( 7,6 );
        calc.percent( 5,2 );
        calc.poweroftwo( 3 );
        try {
            calc.division( 8,4 );
            calc.division( 8, 0 );
        }
        catch (Exception e){
            System.out.println( e.getMessage());
        }
        try{
            calc.sqr( 25 );
            calc.sqr( -25 );
        }
        catch (Exception e){
            System.out.println( e.getMessage());
        }
        try{
            calc.inverse( 3 );
            calc.inverse( 0 );

        } catch (Exception e){
            System.out.println( e.getMessage());
        }
        ScientificCalculator santcalc = new  ScientificCalculator();
        santcalc.sin( 3 );
        santcalc.cos( 5 );
        santcalc.tan( 2 );
        santcalc.cat( 4 );
        santcalc.pow( 6,7 );
        santcalc.exp( 8 );
        try {
            santcalc.log( 8 );
            santcalc.log( -8 );
        }
        catch (Exception e){
            System.out.println( e.getMessage());
        }
        try {
            santcalc.factorial( 10 );
            santcalc.factorial( -10 );;
        }
        catch (Exception e){
            System.out.println( e.getMessage());
        }
        System.out.println(calc.random());
        System.out.println(santcalc.random());
        calc.rounding( 12.323114,2 );
        santcalc.rounding( 12.323114,2 );
    }
}
