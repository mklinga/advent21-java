package com.klinga.advent;

import com.klinga.advent.advents.Advent1;
import com.klinga.advent.advents.Advent2;

public class Advent {
    public static void main(String[] args) {
        System.out.println("It is advent time!");
        System.out.println();

//        System.out.println("# Advent 01 #");
//        Advent1 advent1 = new Advent1();
//        advent1.calculateIncreases();

        System.out.println("# Advent 02 #");
        Advent2 advent2 = new Advent2();
        advent2.calculateDepth();

        System.out.println();
        System.out.println("Happy holidays!");
    }
}
