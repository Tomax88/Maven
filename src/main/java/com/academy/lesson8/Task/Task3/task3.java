package com.academy.lesson8.Task.Task3;

public class task3 {
    public static void main(String[] args) {
        Season S = Season.AUTUMN;
        System.out.println("Вы выбрали сезон: "+S.getName());
        System.out.println("Следующий сезон будет: "+ S.geNextSeason());
        System.out.println("Прошлый сезон был: " + S.getPreviousSeason());

    }
}
