package com.academy.lesson13.Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ListNumb {
    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<>();
        for(int i =0; i<20; i++) {
            listInt.add(1 + (int) (Math.random() * 100));
        }
        System.out.println(listInt);
        System.out.println(Collections.min(listInt));
        System.out.println(Collections.max(listInt));

        int summ = 0;
        for (int i = 0; i<20;i++) {
            summ = summ + listInt.get(i);
        }
        System.out.println(summ);
        int a =0;
        HashMap hashMap = new HashMap();
        for (int i = 0; i < listInt.size(); i++) {
            for (int j = i+1; j < listInt
                    .size(); j++) {
                if (listInt.get(i).equals(listInt.get(j))) {
                    a++;
                }
            }
            if (a!=0) {hashMap.put(listInt.get(i),++a);}
            a=0;
        }
        System.out.println(hashMap);
    }
}
