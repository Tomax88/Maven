package com.academy.lesson16.Demo;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class Demo {
    private static final String PROP_FILE_NAME = "java-part.properties";

    public static void main(String[] args) {
        readProperties();
    }

    private static void readProperties() {
        Properties prop = new Properties();
        InputStream is= Demo.class.getClassLoader().getResourceAsStream(PROP_FILE_NAME);
        try {
            prop.load(new InputStreamReader(is, "UTF-8"));
            String pathMaleFirstNames = prop.getProperty("male.firstnames");
            String pathMaleLastNames = prop.getProperty("male.lastnames");
            System.out.println(pathMaleFirstNames);
            System.out.println(pathMaleLastNames);
            System.out.println(Files.exists(Paths.get(pathMaleFirstNames)));
            Files.lines(Paths.get(pathMaleFirstNames)).forEach(System.out::println);
            System.out.println(Files.exists(Paths.get(pathMaleLastNames)));
            Files.lines(Paths.get(pathMaleLastNames)).forEach(System.out::println);
            String pathFemaleFirstNames = prop.getProperty("female.firstnames");
            String pathFemaleLastNames = prop.getProperty("female.lastnames");
            System.out.println(pathFemaleFirstNames);
            System.out.println(pathFemaleLastNames);
            System.out.println(Files.exists(Paths.get(pathFemaleFirstNames)));
            Files.lines(Paths.get(pathFemaleFirstNames)).forEach(System.out::println);
            System.out.println(Files.exists(Paths.get(pathFemaleLastNames)));
            Files.lines(Paths.get(pathFemaleLastNames)).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
