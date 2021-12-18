package com.klinga.advent.advents.advent2;

import lombok.Data;

@Data
public class SubmarinePosition {
    private long depth;
    private long horizontal;

    public SubmarinePosition(long depth, long horizontal) {
        this.depth = depth;
        this.horizontal = horizontal;
    }

    public SubmarinePosition() {
        this(0, 0);
    }
}
