package com.demo;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

 class City {

    // Initializing the properties
    // of the city class
    private String name;
    private double temperature;

    // Parameterized constructor to
    // initialize the city class
    public City(String name, double temperature)
    {
        this.name = name;
        this.temperature = temperature;
    }

    // Getters to get the name and
    // temperature
    public String getName()
    {
        return name;
    }

    public Double getTemperature()
    {
        return temperature;
    }

    // Overriding the toString method
    // to return the name and temperature
    @Override
    public String toString()
    {
        return name + " --> " + temperature;
    }
}
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

//        Arrays.asList(10,15,8,49,25,98,32)
//                .stream()
//                .filter(n -> n%2 == 0)
//                .forEach(System.out::println);
    }

    void duplicate(){
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        myList.stream().distinct().forEach(System.out::print);

        Set<Integer> sett = new HashSet<>();
        sett.add(2);
        System.out.println("");
        sett.stream().forEach(i -> System.out.print("/t" + i));
    }
    private static List<City> prepareTemperature()
    {
        List<City> cities = new ArrayList<>();
        cities.add(new City("New Delhi", 33.5));
        cities.add(new City("Mexico", 14));
        cities.add(new City("New York", 13));
        cities.add(new City("Dubai", 43));
        cities.add(new City("London", 15));
        cities.add(new City("Alaska", 1));
        cities.add(new City("Kolkata", 30));
        cities.add(new City("Sydney", 11));
        cities.add(new City("Mexico", 14));
        cities.add(new City("Dubai", 43));
        return cities;
    }
    void repeatedChars() {
        String input = "Java Articles are Awesome";


     Set tt =    prepareTemperature()
                .stream()
                .filter(city -> city.getTemperature() > 10)
                .collect(Collectors.
                        toSet());
        System.out.println(tt);
//       Map<Character, Long> masp = input
//                .chars()
//                .mapToObj(s-> Character.toLowerCase(Character.valueOf((char) s)))
//                .collect(Collectors.groupingBy(
//                        Function.identity(),
//                        LinkedHashMap::new,
//                        Collectors.counting()));
//       masp.size();
//    masp.entrySet();
//        Character result = input.chars() // Stream of String
//                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase
//                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count
//                .entrySet()
//                .stream()
//                .filter(entry -> entry.getValue() > 1L)
//                .map(entry -> entry.getKey())
//                .findFirst()
//                .get();
    }
}
