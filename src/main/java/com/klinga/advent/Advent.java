package com.klinga.advent;

import com.klinga.advent.advents.Advent1;

public class Advent {
    public static void main(String[] args) {
        System.out.println("It is advent time!");
        System.out.println();

        System.out.println("# Advent 01 #");
        Advent1 advent1 = new Advent1();
        advent1.calculateIncreases();

        System.out.println();
        System.out.println("Happy holidays!");
    }
}
