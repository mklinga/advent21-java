package com.klinga.advent.advents;

import com.klinga.advent.utils.FileReader;

import java.util.List;
import java.util.stream.IntStream;

public class Advent1 {

    private List<String> input;

    public Advent1() {
        try {
            this.input = FileReader.readFileAsLines("advent1-input");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private long countIncreases(List<Integer> measurements) {
        long increases = IntStream
                .range(1, measurements.size())
                .filter(index -> measurements.get(index) > measurements.get(index - 1))
                .count();
        return increases;
    }

    private List<Integer> generateSlidingSums(List<Integer> measurements) {
        return IntStream
                .range(2, measurements.size())
                .boxed()
                .map(index -> measurements.get(index) + measurements.get(index - 1) + measurements.get(index - 2))
                .toList();
    }

    public void calculateIncreases() {
        List<Integer> measurements = input.stream().map(Integer::parseInt).toList();
        long singleIncreases = countIncreases(measurements);
        System.out.println("Increases: " + singleIncreases);

        long slidingIncreases = countIncreases(generateSlidingSums(measurements));
        System.out.println("Sliding increases: " + slidingIncreases);
    }
}
