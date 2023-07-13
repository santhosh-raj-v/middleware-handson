package com.demo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class BasicPrograms {
    public static void main(String[] args) {

        BasicPrograms bs = new BasicPrograms();

        bs.repeatedChars();
    }
    void even() {
        IntStream.range(0, 21)
                .filter(i -> i%2 ==0)
                .forEach(System.out::print);

        IntStream stream = IntStream.range(6, 10+1);
        stream.forEach(System.out::print);

        IntStream ints = IntStream.rangeClosed(0, 20);

        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        myList.stream()
                .map(s -> s + "") // Convert integer to String
                .filter(s -> s.startsWith("1"))
                .forEach(System.out::println);

    }

    void duplicate(){
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        myList.stream().distinct().forEach(System.out::print);

        Set<Integer> sett = new HashSet<>();
        sett.add(2);
        System.out.println("");
        sett.stream().forEach(i -> System.out.print("/t" + i));
    }

    void repeatedChars() {
        String input = "Java Articles are Awesome";

    }
}
