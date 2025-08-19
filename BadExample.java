package com.example.bad;

import java.util.*; // unused imports

public class BadExample {
    public static void main(String args[]) {
        // Poor naming, unused variable
        int a = 0; 
        int b = 1; 
        int c = 2;
        String name = "Anirudh"; // never used

        // Hardcoded credentials
        String password = "123456";

        // Inefficient loop (busy wait)
        for (int i = 0; i < 1000000; i++) {
            for (int j = 0; j < 1000; j++) {
                // empty loop
            }
        }

        // Null pointer risk
        String text = null;
        System.out.println(text.length());

        // Bad exception handling
        try {
            int x = 10 / 0;
        } catch (Exception e) {
            System.out.println("Something went wrong...");
        }

        // System.out instead of logger
        System.out.println("Done!");
    }

}
