package com.academy.lesson7.demo;

public class DateTests {
    public static void main(String[] args) {
        testLeap();
    }

    private static void testLeap() {
        int[] leapYears = {2004, 2008, 2000, 4};
        int[] notLeapYears = {2003, 2009, 2100, 2007};

        for (int notLeapYear : notLeapYears) {
            Date date = new Date(notLeapYear, 01, 01);
            System.out.println("check: "+ notLeapYear);
            assert !date.isLeap();
        }

        for (int leapYear : leapYears) {
            Date date = new Date(leapYear, 01, 01);
            System.out.println("check: "+ leapYear);
            assert date.isLeap();
        }
    }
}
