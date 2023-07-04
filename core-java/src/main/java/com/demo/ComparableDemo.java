package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparableDemo implements Comparable<ComparableDemo>{

    private double rating;
    private String name;
    private int year;

    public ComparableDemo(String nm, double rt, int yr)
    {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(ComparableDemo o) {
        return this.name.compareTo(o.name);
    }


    public static void main(String[] args) {
        ArrayList<ComparableDemo> list = new ArrayList<>();
        list.add(new ComparableDemo("Force Awakens", 8.3, 2015));
        list.add(new ComparableDemo("Star Wars", 8.7, 1977));
        list.add(new ComparableDemo("Empire Strikes Back", 8.8, 1980));
        list.add(new ComparableDemo("Return of the Jedi", 8.4, 1983));


//        Collections.sort(list, Collections.reverseOrder());

        Collections.sort(list, Collections.reverseOrder());

        System.out.println("Movies after sorting : ");
        for (ComparableDemo movie: list)
        {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());
        }
    }

}
