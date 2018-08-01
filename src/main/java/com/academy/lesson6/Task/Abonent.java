package com.academy.lesson6.Task;
//Реализовать класс Abonent, который имеет поля:
//        long id; // необязательное поле, по умолчанию -1
//        String firstName;
//        String lastName;
//        int age;
//        char gender; // 'm' - male, 'f' - female
//        Все поля должны быть помечены модификатором private
//		- реализовать доступ к полям через методы set и get
//                - реализовать возможность создания класса через два конструктора:
//                1-> все поля, без обязательного поля "id"
//                2-> полный конструктор со всем полями
//                - реализовать метод void print(); вывода информации абонента в отформатированном виде
//                - реализовать метод boolean isEquals(Abonent abonent); // вернут true, если id обоих объектов равны и не равны -1, false - в остальных случаях
//                - протестировать метод isEquals

public class Abonent {
    private long id = -1;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    //with id
    public Abonent(long id, String firstName,String lastName,int age,String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }
    //without id
    public Abonent(String firstName,String lastName,int age,String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void printInf(){
        System.out.println(this.firstName+" "+this.lastName+". "+this.age+" Возраст."+this.gender+" Пол."+this.id + " ID");
    }
    public boolean isEqual(Abonent other) {
        if (this.id == other.id&& this.id!=-1&&other.id!=-1)
            return true;

        return false;
    }
}
