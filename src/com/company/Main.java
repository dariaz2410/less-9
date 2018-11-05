package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sum: " + sum(2, 4, 6, 8, 9));
        System.out.println("Sum: " + sum(120, 32, 5, 7, 11, 3, 10));
    }
    private static int sum (int... params){
        int s = 0;
        for (int i = 0; i < params.length ; i++) {
            s = params[i] + s;
        }
        return s;
    }
}
