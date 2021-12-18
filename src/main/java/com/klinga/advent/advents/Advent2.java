package com.klinga.advent.advents;

import com.klinga.advent.advents.advent2.Submarine;
import com.klinga.advent.advents.advent2.SubmarineMover1;
import com.klinga.advent.advents.advent2.SubmarineMover2;
import com.klinga.advent.utils.FileReader;
import com.klinga.advent.utils.Pair;

import java.util.List;

public class Advent2 {

    private List<String> input;

    public Advent2() {
        try {
            this.input = FileReader.readFileAsLines("advent2-input.txt");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void calculateDepth() {
        List<Submarine> submarines = List.of(new Submarine(new SubmarineMover1()), new Submarine(new SubmarineMover2()));

        int index = 0;
        for (Submarine s : submarines) {
            index++;
            System.out.println("# Submarine with the driving mover " + index + " #");
            s.readInstructions(this.input);

            System.out.println("Depth: " + s.getPosition().getDepth());
            System.out.println("Position: " + s.getPosition().getHorizontal());
            System.out.println("Multiplication: " + s.getPosition().getHorizontal() * s.getPosition().getDepth());
            System.out.println("");
        }
    }
}
