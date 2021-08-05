package com.codecool.ants;

import com.codecool.ants.geometry.Position;

public class Queen extends Ant {
    private boolean isInMood;

    public Queen(Position position, char symbol, Colony colony, boolean isInMood) {
        super(position, symbol, colony);
        this.isInMood = isInMood;
    }

    public void mating() {
//        The queen’s mating mood is following this rule:
//        after a successful mating she sets a countdown timer
//        (starting from some time between 50 and 100 timesteps) to get in the mood again.
    }

    @Override
    void move() {

    }
}
