package com.academy.lesson14.Task4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class StringClass {
    public static void main(String[] args) {

        String str = "Заданную строку:1) разбить на слова;2) отсортировать слова по алфавиту не учитывая регистр первой буквы;3) отсортировать слова по длине; 4) отсортировать слова по последней букве ";

        //разбить на слова
        SplitSentence splitSentence = word -> str.trim().split( "\\s" );

        String[] words = splitSentence.function( str );

        for (String word : words) {
            System.out.println( word );
        }
        //отсортировать слова по алфавиту не учитывая регистр первой буквы

        List<String> sList = new ArrayList<>( Arrays.asList( words ) );

        SortAlphabetically sortAlphabetically = stringList -> sList.sort( new CustomSortAlphabetically() );
        sortAlphabetically.function( sList );
        System.out.println( "Sorted alphabetically: " + sList );

        //отсортировать слова по длине

        SortByLength sortByLength = stringList -> sList.sort( new CustomSortByLength() );
        sortByLength.function( sList );
        System.out.println( "Sorted by length: " + sList );

        //отсортировать слова по последней букве
        SortByLastLetter sortByLastLetter = stringList -> sList.sort( new CustomSortByLastLetter() );
        sortByLastLetter.function( sList );
        System.out.println( "Sorted by last letter: " + sList );
        List<String> list = Arrays.asList(words);
        list.sort((s1, s2)->Character.compare(s1.charAt(s1.length()-1), s2.charAt(s2.length()-1)));
        //list.sort(Comparator.comparingInt(s -> s.charAt(s.length() - 1)));
        System.out.println(list);
        
    }

    interface SplitSentence {
        String[] function(String str);
    }

    interface SortAlphabetically {
        void function(List<String> arr);
    }

    interface SortByLength {
        void function(List<String> arr);
    }

    interface SortByLastLetter {
        void function(List<String> arr);
    }
}
