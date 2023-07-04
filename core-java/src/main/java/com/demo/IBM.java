package com.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.stream.IntStream;

public class IBM {

    public static void main(String[] args) {

        Product d = new Product.Builder()
                .name("coffee")
                .description("ee")
                .build();
        IBM nm = new IBM();

        whitesapce();
/*
        String  sentence = "This is a collection class program where we have used HashMap for storing the string.\n" +
                "\n" +
                "First of all, we have declared our string variable called str. Then we have used split() function delimited by single space so that we can split multiple words in a string.";

         String [] words = sentence.split(" ");

        HashMap<String, Integer> map = new HashMap();

        Arrays.stream(words).forEach(word ->{
            if (map.containsKey(word)) {
                map.put(word, map.get(word)+1);
            } else {
                map.put(word, 1);
            }
        });


        Iterator mapitr = map.entrySet().iterator();

//        if (mapitr.hasNext()) {
//            System.out.println(mapitr.hasNext());
//        }

        mapitr.forEachRemaining(System.out::println);
        String word = "asdawa";

        System.out.println(word.toCharArray());
        String[] chars = word.split("");
        Arrays.stream(chars).forEach(System.out::println);*/
     }

     void isPrime(int n) {
         int temp ;
         int given_no =  n;
         boolean isPrime = true;
        for ( int index =2 ; index <= given_no/2; index++) {
            temp = given_no % index;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("prime" + given_no);
        } else {
            System.out.println("not prime" + given_no);

        }



     }

     void palinfrome() {
        // str == reverse (str)
    }

    void fibonacci () {
        int a=0, b=0, c=1;
        int limit = 10;

        for (int i=0; i<limit; i++) {
            a = b;
            b = c;
            c = a+b;
            System.out.println(a + "");    //if you want to print on the same line, use print()
        }

        // swa
        // Swap
//        int num3 = num2 + num1;
//        num1 = num2;
//        num2 = num3;

    }

    void find_duplicate() {
        // two consecutive chars are same = duplicate
    }

    void second_highest(){

        int arr[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
        int largest =0;
        int secondLargest =0;

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] > largest)
            {
                secondLargest = largest;
                largest = arr[index];
            }
            else if (arr[index] > secondLargest)
            {
                secondLargest = arr[index];
            }
        }
        System.out.println("\nSecond largest number is:" + secondLargest);
        System.out.println("Largest Number is: "  +largest);

    }

    void armstrong() {
        // sum of the cube of the digits in a number  = number
        int n = 153;
        int temp = n;
        int p = 0;

        /*function to calculate
          the sum of individual digits
         */
        while (n > 0) {

            int rem = n % 10;
            System.out.println("remainder " + rem);
            p = (p) + (rem * rem * rem);
            n = n / 10;
            System.out.println("digit remainig " + n);
        }
    }

    static void whitesapce() {

        String str1 = "Saket Saurav        is a QualityAna    list";

        //1. Using replaceAll() Method

        String str2 = str1.replaceAll("\\s", "");

        System.out.println(str2);
        System.out.println( str1.replaceAll("\\s+", " "));

    StringBuilder sb = new StringBuilder();
        char[] chars = str1.toCharArray();
        for (char chr : chars) {
            if( (chr != ' ') && (chr != '\t') )
            {
                sb.append(chr);
            }
        }

    }
}

