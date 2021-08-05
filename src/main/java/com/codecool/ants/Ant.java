package com.codecool.ants;

import com.codecool.ants.geometry.Direction;
import com.codecool.ants.geometry.Position;

public abstract class Ant {
    protected final Colony colony;
    private Position position;
    protected final char symbol;

    public Ant(Position position, char symbol, Colony colony) {
        this.position = position;
        this.symbol = symbol;
        this.colony = colony;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return this.position;
    }

    abstract void move();

    protected void moveIntoDirection(Direction direction) {
        Position nextPosition = this.position.nextDirection(direction);

        if(this.colony.isInColony(nextPosition)) {
            this.position = nextPosition;
        }
    }
}

