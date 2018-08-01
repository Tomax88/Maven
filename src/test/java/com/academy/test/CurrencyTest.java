package com.academy.test;
import com.academy.lesson6.Task.Currency;

public class CurrencyTest {
    public static void main(String[] args) {
        CurrencyTest test = new CurrencyTest();
        test.constructorTest();
        test.copyConstructorTest();
        test.isEqualTest();
    }

    public void constructorTest() {
        Currency cur = new Currency(10, "руб");
        assert cur.getValue() == 10;
        assert cur.getName().equals("руб");
    }

    public void copyConstructorTest() {

    }

    public void isEqualTest() {
        Currency cur1 = new Currency(10, "руб");
        Currency cur2 = new Currency(10, "руб");
        Currency cur3 = new Currency(11, "руб");

        assert cur1.isEqual(cur2);
        assert !cur1.isEqual(cur3);
    }
}
