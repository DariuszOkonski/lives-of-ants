package com.codecool.ants;

import com.codecool.ants.geometry.Position;

import java.util.Random;

public class Colony {
    private int width;
    private Ant Queen;
    private Ant[][] sandbox;

    public Colony(int width) {
        this.width = width;
        this.Queen = new Queen(new Position(width/2, width/2), 'Q', this, false);

        this.setInitialSandbox();
        this.generateAnts(2,3,4);
    }

    public Ant getQueen() {
        return Queen;
    }

    public void update() {
        // dla każedj mrówki - act
        // display

    }

    public void display() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                var symbol = this.sandbox[i][j] == null ? "~" : this.sandbox[i][j].getSymbol();
                System.out.print(symbol+ " ");
            }
            System.out.println();
        }
    }

    public boolean isInColony(Position position) {
        return position.getX() >= 0 && position.getX() < this.width &&
                position.getY() >= 0 && position.getY() < this.width;
    }

    private void setInitialSandbox() {
        this.sandbox = new Ant[width][];

        for (int i = 0; i < width; i++) {
            this.sandbox[i] = new Ant[width];
        }

        this.sandbox[this.getQueen().getPosition().getX()][this.getQueen().getPosition().getY()] = this.Queen;

    }

    private void generateAnts(int numberOfDrones, int numberOfWorkers, int numberOfSoldiers) {
        Random random = new Random();
        generateDrones(numberOfDrones, random);
        generateWorkers(numberOfWorkers, random);
        generateSoldiers(numberOfSoldiers, random);
    }

    private void generateSoldiers(int numberOfSoldiers, Random random) {
        for (int i = 0; i < numberOfSoldiers; i++) {
            int x = random.nextInt(width);
            int y = random.nextInt(width);
            Position position = new Position(x, y);

            if(position.compareTo(this.Queen.getPosition()) == 0
                    || this.sandbox[position.getX()][position.getY()] != null)
            {
                i--;
                continue;
            }

            this.sandbox[x][y] = new Soldier(position, this);
        }
    }

    private void generateWorkers(int numberOfWorkers, Random random) {
        for (int i = 0; i < numberOfWorkers; i++) {
            int x = random.nextInt(width);
            int y = random.nextInt(width);
            Position position = new Position(x, y);

            if(position.compareTo(this.Queen.getPosition()) == 0
                    || this.sandbox[position.getX()][position.getY()] != null)
            {
                i--;
                continue;
            }

            this.sandbox[x][y] = new Worker(position, this);
        }
    }

    private void generateDrones(int numberOfDrones, Random random) {
        for (int i = 0; i < numberOfDrones; i++) {
            int x = random.nextInt(width);
            int y = random.nextInt(width);
            Position position = new Position(x, y);

            if(position.compareTo(this.Queen.getPosition()) == 0
                    || this.sandbox[position.getX()][position.getY()] != null)
            {
                i--;
                continue;
            }

            this.sandbox[x][y] = new Drone(position, this);
        }
    }
}