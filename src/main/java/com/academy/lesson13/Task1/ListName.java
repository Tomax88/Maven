package com.academy.lesson13.Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListName {
    public static void main(String[] args) {
        List<String>  listarr = new ArrayList<>
                (Arrays.asList("Peter", "Helen", "Andry", "Abdel", "Kate", "Veronica", "Leonid", "Alex", "max"));
        System.out.println(listarr);

        System.out.println("******** Add List *******");

        listarr.add("Philip");
        listarr.add("leon");
        listarr.add("Joseph");
        System.out.println(listarr);

        System.out.println("************ Remove ************");

        listarr.remove("Veronica");
        listarr.remove("Leonid");
        System.out.println(listarr);

        System.out.println("******* Change , Sort , Reverse *******");
        listarr.set(listarr.indexOf("Helen"), "Elizabet");
        Collections.sort(listarr);
        System.out.println(listarr);
        Collections.reverse(listarr);
        System.out.println(listarr);
        System.out.println("************** Contain *************");
        System.out.println(listarr.contains("Andry"));






    }
}
