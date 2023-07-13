package com.swift;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SwiftApp {
    public static void main(String[] args) {
       /* 100000000
        100000000*/
        String matchDate = "[0-9]{6}";
        String matcherCombine = "([A-Z]{3})|([0-9]+)|([0-9]+,?[0-9]*)";
        String A = "230207USD10000000,000000";
//        String matcherCombine = "([0-9]+)|([0-9]+,[0-9]*)|([A-Z]{3})";
        Pattern patten = Pattern.compile(matcherCombine);
        Matcher matcher = patten.matcher(A);

        Pattern datePattern = Pattern.compile(matchDate);
        Matcher datePatternMatcher = datePattern.matcher(A);

        List<String> finalOutputValues = new ArrayList<>();
        System.out.println("Group Count " + matcher.groupCount());
        while (matcher.find()) {
            finalOutputValues.add(matcher.group().trim());
        }

        List<String> matcherList = new ArrayList<>();
        while (datePatternMatcher.find()) {
            matcherList.add(datePatternMatcher.group().trim());
        }
        System.out.println("Group Count " + datePatternMatcher.groupCount());
    }
}
