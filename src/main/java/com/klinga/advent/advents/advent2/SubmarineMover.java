package com.klinga.advent.advents.advent2;

import com.klinga.advent.advents.Advent2;

public interface SubmarineMover {
    void move(String command, Long amount);

    SubmarinePosition getPosition();
}
