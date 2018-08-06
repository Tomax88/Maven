package com.academy.lesson11.task3;

public interface ScientificOperations extends ArithmeticOperations {
    public double sin (double a);
    public double cos (double a);
    public double tan (double a);
    public double cat (double a);
    public double log (double a) throws Exception;
    public double pow (double a, double b);
    public double factorial  (double a) throws Exception;
    public double exp (double a);
}
