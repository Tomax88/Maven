package com.academy.lesson15.Task1;
import java.util.*;
import java.util.stream.Collectors;

public class Subscriber {
    public static void main(String[] args) {
        personGen();
    }
    private static void personGen() {
        Person1[] person1arr = new Person1[100];
        fillPerson1Random(person1arr);
        streamCollect();
        List<Person1> person1List = new ArrayList<>(Arrays.asList(person1arr));
        for (int i = 0; i < person1List.size(); i++) {
            System.out.println(person1List.get(i));
        }
        Map<Long, Person1> personMap = new HashMap<>();
        for (Person1 person : person1List) {
            personMap.put(person.getId(), person);
        }
    }

    private static void streamCollect() {
        Person1[] person1arr = new Person1[100];
        fillPerson1Random(person1arr);
        List<Person1> person1List1 =
                Arrays.stream(person1arr)
                        .distinct()
                        .sorted(Person1::compareTo)
                        .collect(Collectors.toList());

        System.out.println(person1List1);
    }

    private static void fillPerson1Random(Person1[] person1arr) {
        String[] names = {"Peter", "Helen", "Andry", "Abdel", "Kate", "Veronica", "Leonid", "Alex", "Max"};
        String[] lNames = {"Ivanov","Petrov","Sidorov","Aliev","Kirilov","Vladimirov","Uganov","Avilov","Zagursky","Sokolov"};
//       Random rnd = new Random();
//        int n = 100000 + rnd.nextInt(900000);
        //     String elementaryPhoneNumber = "999";
        long id = 123456;
        final int ageFrom = 18;
        final int ageTo = 60;
        for (int i = 0; i < person1arr.length; i++) {
            id++;
            int nameIndex = (int) (Math.random() * names.length);
            String name = names[nameIndex];
            int lNameIndex = (int) (Math.random() * lNames.length);
            String lastName = lNames[lNameIndex];
            int age = ageFrom + (int) (Math.random() * (ageTo - ageFrom));
            Random rnd = new Random();
            int n = 100000 + rnd.nextInt(900000);
            String elementaryPhoneNumber = "999"+Integer.toString(n)+"5";
            person1arr[i] = new Person1(id,name,lastName,age,elementaryPhoneNumber);
        }

    }

}
