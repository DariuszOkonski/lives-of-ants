package com.codecool.ants.geometry;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public enum Direction {
    NORTH(0, -1),
    EAST(1, 0),
    SOUTH (0, 1),
    WEST(-1, 0);

    int dx;
    int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public static Direction getRandomDirection() {
        Direction[] values = Direction.values();
        int i = ThreadLocalRandom.current().nextInt(values.length);
        return values[i];
    }

    public Direction turnLeft() {
        int i = (ordinal() + 3 % Direction.values().length);
        return Direction.values()[i];
    }

    public Direction turnRight() {
        int i = (ordinal() + 1 % Direction.values().length);
        return Direction.values()[i];
    }
}
