package com.klinga.advent.advents.advent2;

import com.klinga.advent.utils.Pair;

public class InstructionParser {
    public static Pair<String, Long> parse (String instruction) {
        String[] parts = instruction.split(" ");
        Long amount = Long.parseLong(parts[1]);
        return new Pair<>(parts[0], amount);
    }
}
