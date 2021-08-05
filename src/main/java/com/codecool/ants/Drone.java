package com.codecool.ants;

import com.codecool.ants.geometry.Position;

public class Drone extends Ant {
    public Drone(Position position, Colony colony) {
        super(position, 'D', colony);
    }

    @Override
    void move() {
//        the drones always try to make one step towards the Queen.
//        When they get next to the queen, they have a chance that she is in the mood of mating. In this happy case they say "HALLELUJAH", and stay there for 10 timesteps. After that they are kicked off to a random position at the edge of the colony.
//        If the queen isn't in the mood, drones say ":(", and are kicked away instantly.
    }
}
