package com.klinga.advent.advents.advent2;

import com.klinga.advent.utils.Pair;

import java.util.List;

public class Submarine {
    private SubmarineMover mover;

    public Submarine(SubmarineMover mover) {
        this.mover = mover;
    }

    public void readInstructions(List<String> instructions) {
        for (String instruction : instructions) {
            Pair<String, Long> parsedInstruction = InstructionParser.parse(instruction);
            this.mover.move(parsedInstruction.key(), parsedInstruction.value());
        }
    }

    public SubmarinePosition getPosition() {
        return this.mover.getPosition();
    }
}

