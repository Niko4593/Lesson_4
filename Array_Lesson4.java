package Lesson_4;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Array_Lesson4 {
    public static void main(String[] args){

        ArrayList <String> arrayList = new ArrayList<>();
        arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("Third");
        arrayList.add("First");
        arrayList.add("Fourth");
        arrayList.add("Second");
        arrayList.add("Fifth");
        arrayList.add("Sixth");
        arrayList.add("First");
        arrayList.add("Fourth");
        arrayList.add("Second");
        arrayList.add("Fifth");
        arrayList.add("Third");
        arrayList.add("Fourth");
        arrayList.add("First");

        Stream stream = arrayList.stream();

        System.out.println("Unique equals of arrayList -> " + (arrayList.stream().distinct().collect(Collectors.toList())));

        System.out.println("'First' - " + (arrayList.stream().filter("First"::equals).count()) + " times in arrayList");
        System.out.println("'Second' - " + (arrayList.stream().filter("Second"::equals).count())+ " times in arrayList");
        System.out.println("'Third' - " + (arrayList.stream().filter("Third"::equals).count())+ " times in arrayList");
        System.out.println("'Fourth' - " + (arrayList.stream().filter("Fourth"::equals).count())+ " times in arrayList");
        System.out.println("'Fifth' - " + (arrayList.stream().filter("Fifth"::equals).count()) + " times in arrayList");
        System.out.println("'Sixth' - " + (arrayList.stream().filter("Sixth"::equals).count()) + " times in arrayList");


    }
}
