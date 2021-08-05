package com.codecool.ants.geometry;

public class Position implements Comparable<Position> {

    private final int x;
    private final int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Position nextDirection(Direction direction) {
        return new Position(this.x + direction.dx, this.y + direction.dy);
    }

    @Override
    public int compareTo(Position o) {
        return (this.x == o.x && this.y == o.y) ? 0 : -1;
    }
}