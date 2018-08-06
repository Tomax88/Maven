package com.academy.lesson11.task3;

import java.math.BigDecimal;

public interface ArithmeticOperations {
    public double Sum (double a, double b);// сложение
    public double subtraction (double a, double b);// вычитание
    public double multiplication (double a, double b);// умножение
    public double division (double a, double b) throws Exception;// деление
    public double percent (double a, double b);// вычисление процента
    public double sqr (double a) throws Exception;// квадратный корень
    public double poweroftwo (double a);// возведение в квадрат
    public double inverse (double a) throws Exception;// вычисление обратного числа
    public double random();//рандомизация
    public BigDecimal rounding(double a, int b);//округление
}
