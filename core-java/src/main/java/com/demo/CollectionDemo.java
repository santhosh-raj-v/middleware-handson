package com.demo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionDemo {
    public static void main(String[] args) throws InterruptedException {

        Runnable r1 = new Thread("Runnable");
        Thread t = new Thread("My first thread");
        Runnable thread3 = () -> {   // lambda expression
            System.out.println("Runnable with Lambda Expression");
        };

        new Thread(r1).start();
        new Thread(thread3).start();
    }

}
