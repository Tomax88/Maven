package com.academy.lesson8.Task.Task3;

public enum Manths {
    JANUARY("Январь", "Січень",31),
    FEBRUARY("Февраль", "Лютий", 28),
    MARCH("Март", "Березень", 31),
    APRIL("АПРЕЛЬ", "Квітень", 30),
    MAY("Май", "Травень", 31),
    JUNE("Июнь", "Червень", 30),
    JULY("Июль", "Липень", 31),
    AUGUST("Август", "Серпень", 31),
    SEPTEMBER("Сентябрь", "Вересень", 30),
    OCTOBER("Октябрь", "Жовтень", 31),
    NOVEMBER("Ноябрь", "Листопад", 30),
    DECEMBER("Декабрь", "Грудень", 31);
    private String name;
    private String ukrName;
    private int quantity;

    Manths(String name, String ukrName, int quantity) {
        this.name = name;
        this.ukrName = ukrName;
        this.quantity = quantity;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setUkrName(String ukrName) {
        this.ukrName = ukrName;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    //Метод получения названия на русском языке
    String getNameRUS() {
        return name;
    }
    //Метод получения названия месяца на украинском языке
    String getNameUKR() {
        return ukrName;
    }
    //Метод определения прошлого месяца
    public String getPreviousMonth(){
        if (this.name.equals(JANUARY.name))
            return DECEMBER.name;
        if (this.name.equals(FEBRUARY.name))
            return JANUARY.name;
        if (this.name.equals(MARCH.name))
            return FEBRUARY.name;
        if (this.name.equals(APRIL.name))
            return MARCH.name;
        if (this.name.equals(MAY.name))
            return APRIL.name;
        if (this.name.equals(JUNE.name))
            return MAY.name;
        if (this.name.equals(JULY.name))
            return JUNE.name;
        if (this.name.equals(AUGUST.name))
            return JULY.name;
        if (this.name.equals(SEPTEMBER.name))
            return AUGUST.name;
        if (this.name.equals(OCTOBER.name))
            return SEPTEMBER.name;
        if (this.name.equals(NOVEMBER.name))
            return OCTOBER.name;
        if (this.name.equals(DECEMBER.name))
            return NOVEMBER.name;
        return "Ошибка";
    }
    //Метод определения следующешл месяца
    public String getNextMonth(){
        if (this.name.equals(JANUARY.name))
            return FEBRUARY.name;
        if (this.name.equals(FEBRUARY.name))
            return MARCH.name;
        if (this.name.equals(MARCH.name))
            return APRIL.name;
        if (this.name.equals(APRIL.name))
            return MAY.name;
        if (this.name.equals(MAY.name))
            return JUNE.name;
        if (this.name.equals(JUNE.name))
            return JULY.name;
        if (this.name.equals(JULY.name))
            return AUGUST.name;
        if (this.name.equals(AUGUST.name))
            return SEPTEMBER.name;
        if (this.name.equals(SEPTEMBER.name))
            return OCTOBER.name;
        if (this.name.equals(OCTOBER.name))
            return NOVEMBER.name;
        if (this.name.equals(NOVEMBER.name))
            return DECEMBER.name;
        if (this.name.equals(DECEMBER.name))
            return JANUARY.name;
        return "Ошибка";
    }
    //метод определения сезона
    public String getSeasonMonth(){
        if ((this.name.equals(JANUARY.name))||(this.name.equals(FEBRUARY.name))||(this.name.equals(DECEMBER.name)))
            return Season.WINTER.getName();
        if ((this.name.equals(MARCH.name))||(this.name.equals(APRIL.name))||(this.name.equals(MAY.name)))
            return Season.SPRING.getName();
        if ((this.name.equals(JUNE.name))||(this.name.equals(JULY.name))||(this.name.equals(AUGUST.name)))
            return Season.SUMMER.getName();
        if ((this.name.equals(SEPTEMBER.name))||(this.name.equals(OCTOBER.name))||(this.name.equals(NOVEMBER.name)))
            return Season.AUTUMN.getName();
        return "Ошибка";
    }
}