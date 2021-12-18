package com.klinga.advent.advents.advent2;

public class SubmarineMover2 implements SubmarineMover {
    private SubmarinePosition position = new SubmarinePosition();

    private long aim = 0;

    public void move(String command, Long amount) {
        if (command.equals("forward")) {
            this.position.setHorizontal(this.position.getHorizontal() + amount);
            this.position.setDepth(this.position.getDepth() + (amount * this.aim));
        } else if (command.equals("down")) {
            this.aim += amount;
        } else if (command.equals("up")) {
            this.aim -= amount;
        }
    }

    public SubmarinePosition getPosition() {
        return this.position;
    }
}
