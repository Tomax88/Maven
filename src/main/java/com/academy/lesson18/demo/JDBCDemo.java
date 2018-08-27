package com.academy.lesson18.demo;

import com.academy.lesson16.Demo.Demo;
import com.academy.lesson18.dao.AbonentDao;
import com.academy.lesson18.dao.impl.BaseDao;
import com.academy.lesson18.dao.impl.jdbc.AbonentDaoImpl;
import com.academy.lesson18.manager.PropertyManager;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;

//Для   продолжения работы над lesson18 надо разкомитить (осталось доделать задания 4,5)

//public class JDBCDemo {
//    private static final String PROP_FILE_NAME = "java-part.properties";
//    private static final String SQL_INSERT_ABONENTS = "INSERT INTO testsql.abonent(abonent_id, first_name, last_name, gender, age) " + "VALUES (?,?,?,?,?);";
//    private static final String SQL_INSERT_NUMBERS = "INSERT INTO testsql.operator_number(number,operator_id) VALUES(?,?);";
//    private static final String SQL_INSERT_PHONE_BOOK = "INSERT INTO testsql.phone_book(number,abonent_id) VALUES(?,?);";
//    private static final String SQL_SELECT_FREE_NUMBERS = "SELECT operator_number.number FROM testsql.operator_number, testsql.phone_book " +
//            "WHERE operator_number.number NOT IN (SELECT number FROM testsql.phone_book) GROUP BY operator_number.number LIMIT 10;";
//    public static void main(String[] args) {
//        //demoReadAbonents();
//        Properties prop = new Properties();
//        InputStream is = Demo.class.getClassLoader().getResourceAsStream( PROP_FILE_NAME );
//
//        try {
//            prop.load( new InputStreamReader( is , "UTF-8" ) );
//            Path pathMaleFirstNames = Paths.get( prop.getProperty( "male.firstnames" ) );
//            Path pathMaleLastNames = Paths.get( prop.getProperty( "male.lastnames" ) );
//            Path pathFemaleFirstNames = Paths.get( prop.getProperty( "female.firstnames" ) );
//            Path pathFemaleLastNames = Paths.get( prop.getProperty( "female.lastnames" ) );
//
//
//            List<String> maleFirst = new ArrayList<String>();
//            List<String> maleLast = new ArrayList<String>();
//            List<String> femaleFirst = new ArrayList<String>();
//            List<String> femaleLast = new ArrayList<String>();
//
//            maleFirst = Files.readAllLines( pathMaleFirstNames );
//            maleLast = Files.readAllLines( pathMaleLastNames );
//            femaleFirst = Files.readAllLines( pathFemaleFirstNames );
//            femaleLast = Files.readAllLines( pathFemaleLastNames );
//            BaseDao base = new BaseDao();
//            Connection connection = DriverManager.getConnection( PropertyManager.getInstance().getProperty( "jdbc.connect" ) );
//            PreparedStatement ps = connection.prepareStatement( SQL_INSERT_NUMBERS );
//            connection.setAutoCommit( false );

//            Временно не разкомичевать

//            for (int i = 1; i <= 200000; i++) {
//               PreparedStatement ps = connection.prepareStatement( SQL_INSERT_ABONENTS );
//                Random r = new Random();
//                int sex = r.nextInt( (2 - 1) + 1 ) + 1;
//                int age = r.nextInt( (90-5)+1 )+5;
//                int maleNameNum = r.nextInt( (maleFirst.size()) );
//                int maleLastNameNum = r.nextInt( (maleLast.size()) );
//                int femaleNameNum = r.nextInt( (femaleFirst.size()) );
//                int femaleLastNameNum = r.nextInt( (femaleLast.size()) );
//                switch (sex) {
//                    case 1:
//                        ps.setInt( 1 , (i+20) );
//                        ps.setString( 2 , maleFirst.get( maleNameNum ) );
//                        ps.setString( 3 , maleLast.get( maleLastNameNum ) );
//                        ps.setString( 4 , "m" );
//                        ps.setInt( 5 , age );
//                        ps.execute();
//                        break;
//                    case 2:
//                        ps.setInt( 1 , (i+20) );
//                        ps.setString( 2 , femaleFirst.get( femaleNameNum ) );
//                        ps.setString( 3 , femaleLast.get( femaleLastNameNum ) );
//                        ps.setString( 4 , "f" );
//                        ps.setInt( 5 , age );
//                        ps.execute();
//
//                        break;
//                    default:
//                        System.out.println("error");
//                        break;
//                }
//
//            }
//            demoReadAbonents();

//            ps = connection.prepareStatement( SQL_INSERT_NUMBERS );

//            for (int i = 1; i <=100000 ; i++) {
//                long number;
//                if(i<=30000){
//                    number = 380630000000L;
//                    ps.setString( 1, Long.toString( number+i ) );
//                    ps.setInt( 2,1 );
//                    ps.execute();
//                    System.out.println("Генерируеться запись номемр life >> "+i);
//                }
//                if(i>30000 && i<=60000){
//                    number = 380930000000L;
//                    ps.setString( 1, Long.toString( number+i -30000 ) );
//                    ps.setInt( 2,1 );
//                    ps.execute();
//                    System.out.println("Генерируеться запись номемр life >> "+i);
//                }
//                if(i>60000) {
//                    number = 380730000000L;
//                    ps.setString( 1, Long.toString( number +i - 60000) );
//                    ps.setInt( 2,1 );
//                    ps.execute();
//                    System.out.println("Генерируеться запись номемр life >> "+i);
//                }
//
//            }
//            for (int i = 1; i <=100000 ; i++) {
//                long number;
//                if(i<=30000){
//                    number = 380500000000L;
//                    ps.setString( 1, Long.toString( number+i ) );
//                    ps.setInt( 2,2 );
//                    ps.execute();
//                    System.out.println("Генерируеться запись номемр mts >> "+i);
//                }
//                if(i>30000 && i<=60000){
//                    number = 380660000000L;
//                    ps.setString( 1, Long.toString( number+i -30000 ) );
//                    ps.setInt( 2,2 );
//                    ps.execute();
//                    System.out.println("Генерируеться запись номемр mts >> "+i);
//                }
//                if(i>60000) {
//                    number = 380950000000L;
//                    ps.setString( 1, Long.toString( number +i - 60000) );
//                    ps.setInt( 2,2 );
//                    ps.execute();
//                    System.out.println("Генерируеться запись номемр mts >> "+i);
//                }
//
//            }
//            for (int i = 1; i <=100000 ; i++) {
//                long number;
//                if(i<=30000){
//                    number = 380970000000L;
//                    ps.setString( 1, Long.toString( number+i ) );
//                    ps.setInt( 2,3 );
//                    ps.execute();
//                    System.out.println("Генерируеться запись номемр kiev >> "+i);
//                }
//                if(i>30000 && i<=60000){
//                    number = 380670000000L;
//                    ps.setString( 1, Long.toString( number+i -30000 ) );
//                    ps.setInt( 2,3 );
//                    ps.execute();
//                    System.out.println("Генерируеться запись номемр kiev >> "+i);
//                }
//                if(i>60000) {
//                    number = 380980000000L;
//                    ps.setString( 1, Long.toString( number +i - 60000) );
//                    ps.setInt( 2,3 );
//                    ps.execute();
//                    System.out.println("Генерируеться запись номемр kiev >> "+i);
//                }
//
//            }
//            ps = connection.prepareStatement( SQL_INSERT_PHONE_BOOK );
//            int numberIncrement = 1;
//            int operator = 1;
//            for (int i = 1; i <= 200000; i++) {
//                Random r = new Random();
//                long number;
//
//
//                int abonent = r.nextInt( 200019 ) + 1;
//                int numberRand;
//                switch (operator) {
//                    case 1:
//                        if (numberIncrement < 23000) {
//                            number = 380630000000L + numberIncrement;
//                            System.out.println(Long.toString( number ));
//                            ps.setString( 1 , Long.toString( number ) );
//                            ps.setInt( 2 , abonent );
//                            ps.execute();
//                            numberIncrement += 1;
//                            System.out.println( "Генерируеться запись номер " + i );
//                        } else {
//                            operator += 1;
//                            numberIncrement = 1;
//                        }
//                        break;
//                    case 2:
//                        if (numberIncrement < 23000) {
//                            number = 380930000000L + numberIncrement;
//                            ps.setString( 1 , Long.toString( number ) );
//                            ps.setInt( 2 , abonent );
//                            ps.execute();
//                            numberIncrement += 1;
//                            System.out.println( "Генерируеться запись номер " + i );
//                        } else {
//                            operator += 1;
//                            numberIncrement = 1;
//                        }
//                        break;
//                    case 3:
//                        if (numberIncrement < 23000) {
//
//                            number = 380730000000L + numberIncrement;
//                            ;
//                            ps.setString( 1 , Long.toString( number ) );
//                            ps.setInt( 2 , abonent );
//                            ps.execute();
//                            numberIncrement += 1;
//                            System.out.println( "Генерируеться запись номер " + i );
//                        } else {
//                            operator += 1;
//                            numberIncrement = 1;
//                        }
//                        break;
//                    case 4:
//                        if (numberIncrement < 23000) {
//
//                            number = 380500000000L + numberIncrement;
//                            ;
//                            ps.setString( 1 , Long.toString( number ) );
//                            ps.setInt( 2 , abonent );
//                            ps.execute();
//                            numberIncrement += 1;
//                            System.out.println( "Генерируеться запись номер " + i );
//                        } else {
//                            operator += 1;
//                            numberIncrement = 1;
//                        }
//                        break;
//                    case 5:
//                        if (numberIncrement < 23000) {
//
//                            number = 380660000000L + numberIncrement;
//                            ps.setString( 1 , Long.toString( number ) );
//                            ps.setInt( 2 , abonent );
//                            ps.execute();
//                            numberIncrement += 1;
//                            System.out.println( "Генерируеться запись номер " + i );
//                        } else {
//                            operator += 1;
//                            numberIncrement = 1;
//                        }
//                        break;
//                    case 6:
//                        if (numberIncrement < 23000) {
//
//                            number = 380950000000L + numberIncrement;
//                            ps.setString( 1 , Long.toString( number ) );
//                            ps.setInt( 2 , abonent );
//                            ps.execute();
//                            numberIncrement += 1;
//                            System.out.println( "Генерируеться запись номер " + i );
//                        } else {
//                            operator += 1;
//                            numberIncrement = 1;
//                        }
//                        break;
//                    case 7:
//                        if (numberIncrement < 23000) {
//
//                            number = 380970000000L + numberIncrement;
//                            ps.setString( 1 , Long.toString( number ) );
//                            ps.setInt( 2 , abonent );
//                            ps.execute();
//                            numberIncrement += 1;
//                            System.out.println( "Генерируеться запись номер " + i );
//                        } else {
//                            operator += 1;
//                            numberIncrement = 1;
//                        }
//
//                        break;
//                    case 8:
//                        if (numberIncrement < 23000) {
//
//                            number = 380670000000L + numberIncrement;
//                            ps.setString( 1 , Long.toString( number ) );
//                            ps.setInt( 2 , abonent );
//                            ps.execute();
//                            numberIncrement += 1;
//                            System.out.println( "Генерируеться запись номер " + i );
//
//                        } else {
//                            operator += 1;
//                            numberIncrement = 1;
//                        }
//                        break;
//                    case 9:
//                        if (numberIncrement < 23000) {
//
//                            number = 380980000000L + numberIncrement;
//                            ps.setString( 1 , Long.toString( number ) );
//                            ps.setInt( 2 , abonent );
//                            ps.execute();
//                            numberIncrement += 1;
//                            System.out.println( "Генерируеться запись номер " + i );
//                        } else {
//                            operator += 1;
//                            numberIncrement = 1;
//                        }
//                        break;
//                    default:
//                        System.out.println( "error" );
//                        break;
//                }
//        }
            //Для   продолжения работы над lesson18 надо разкомитить (осталось доделать задания 4,5)

//            ps = connection.prepareStatement( SQL_SELECT_FREE_NUMBERS );
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                System.out.println(rs.getString( "operator_number.number" ));
//            }
//            connection.commit();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    private static void demoReadAbonents() {
//        AbonentDao abonentDao = new AbonentDaoImpl();
//        abonentDao.getAll().stream().forEach( System.out::println );
//    }
//
//}
