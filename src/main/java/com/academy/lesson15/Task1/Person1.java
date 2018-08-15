package com.academy.lesson15.Task1;

import java.util.Objects;

public class Person1 implements Comparable<Person1> {
    private long id;
    private String name;
    private String lastName;
    private int age;
    private String phoneNumber;

    public Person1(long id, String name,String lastName, int age,String phoneNumber) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void getPhoneNumber(String[]number, String elementaryPhoneNumber, String phoneNumber) {
        phoneNumber = elementaryPhoneNumber;
        for (int i =0; i<8;i++){
            int c = (int) (Math.random()* 9);
            phoneNumber = phoneNumber + number[c];
        }
        phoneNumber = phoneNumber+"5";
        this.phoneNumber = phoneNumber;
    }



    @Override
    public String toString() {
        return "Person1 " +
                "id=" + id +
                ", name= " + name +
                ", lastName= " + lastName +
                ", age= " + age +
                ", phoneNumber= " + phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person1 person1 = (Person1) o;
        return id == person1.id &&
                age == person1.age &&
                Objects.equals(name, person1.name) &&
                Objects.equals(lastName, person1.lastName) &&
                Objects.equals(phoneNumber, person1.phoneNumber);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, lastName, age, phoneNumber);
    }

    // SORT
    @Override
    public int compareTo(Person1 o) {
        return Long.compare(this.id, o.id);
    }
}
