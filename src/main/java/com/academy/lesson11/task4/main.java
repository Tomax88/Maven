package com.academy.lesson11.task4;

import com.academy.lesson11.task3.Calculator;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        for (; ; ) {
            System.out.println( "Введите первое число" );
            Scanner scanner = new Scanner( System.in );
            double a = 0;
            try{
                a = scanner.nextDouble();
            }
                catch(Exception e){
                System.out.println("Введи число мраааазь");
                continue;
            }
            System.out.println( "Введите номер операции из перечисленного списка (1 = + ,2 = - ,3 = * ,4 = / ,5 = ^ ,6 = №)" );
            int op = scanner.nextInt();
            double c = 0;
            Calculator calc = new Calculator();
            switch (op) {
                case 1:
                    System.out.println( "Введите второе число" );

                    try{
                        c = scanner.nextDouble();
                    }
                    catch(Exception e){
                        System.out.println("Введи число мраааазь");
                    }
                    calc.Sum( a,c );
                    break;
                case 2:
                    System.out.println( "Введите второе число" );

                    try{
                        c = scanner.nextDouble();
                    }
                    catch(Exception e){
                        System.out.println("Введи число мраааазь");
                    }
                    calc.subtraction( a,c );
                    break;

                case 3:
                    System.out.println( "Введите второе число" );
                    try{
                        c = scanner.nextDouble();
                    }
                    catch(Exception e){
                        System.out.println("Введи число мраааазь");
                    }

                    calc.multiplication( a,c );
                case 4:
                    System.out.println( "Введите второе число" );
                    try{
                        c = scanner.nextDouble();
                    }
                    catch(Exception e){
                        System.out.println("Введи число мраааазь");
                    }

                    try {
                        calc.division( a , c );
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    calc.poweroftwo( a );
                    break;
                case 6:
                    try{
                        calc.sqr( a );
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println( " Unknown operation" );
                    return;

            }

        }
    }
}
