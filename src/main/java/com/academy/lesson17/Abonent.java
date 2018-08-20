package com.academy.lesson17;
import java.util.Objects;

public class Abonent implements Comparable<Abonent> {
    private long abonent_id; 		// уникальный идентификатор
    private String firstName; 	// имя
    private String lastName;  	// фамилия
    private int age; 				// возраст
    private Enum gender;

    public Abonent(long abonent_id, String firstName, String lastName, int age, Enum gender) {
        this.abonent_id = abonent_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public long getAbonent_id() {
        return abonent_id;
    }

    public void setAbonent_id(long abonent_id) {
        this.abonent_id = abonent_id;
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

    public Enum getGender() {
        return gender;
    }

    public void setGender(Enum gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Abonent abonent = (Abonent) o;
        return abonent_id == abonent.abonent_id &&
                age == abonent.age &&
                Objects.equals(firstName, abonent.firstName) &&
                Objects.equals(lastName, abonent.lastName) &&
                Objects.equals(gender, abonent.gender);
    }

    @Override
    public int hashCode() {

        return Objects.hash(abonent_id, firstName, lastName, age, gender);
    }

    @Override
    public String toString() {
        return "Abonent " +
                "abonent_id " + abonent_id +
                " firstName " + firstName +
                "  lastName " + lastName +
                "  age " + age +
                "  gender " + gender;
    }

    @Override
    public int compareTo(Abonent o) {
        return Long.compare(this.abonent_id,o.abonent_id);
    }
}
