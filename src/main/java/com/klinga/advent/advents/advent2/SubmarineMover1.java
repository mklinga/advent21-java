package com.klinga.advent.advents.advent2;

public class SubmarineMover1 implements SubmarineMover {
    private SubmarinePosition position = new SubmarinePosition();

    public void move(String command, Long amount) {
        if (command.equals("forward")) {
            this.position.setHorizontal(this.position.getHorizontal() + amount);
        } else if (command.equals("down")) {
            this.position.setDepth(this.position.getDepth() + amount);
        } else if (command.equals("up")) {
            this.position.setDepth(this.position.getDepth() - amount);
        }
    }

    public SubmarinePosition getPosition() {
        return this.position;
    }
}
