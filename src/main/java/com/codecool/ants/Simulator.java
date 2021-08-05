package com.codecool.ants;

public class Simulator {

    public static void main(String[] args) {
        var colony = new Colony(10);

        System.out.println("--------------------------------");


        colony.display();
        System.out.println();
        for (int i = 0; i < 3; i++) {
            colony.update();
            colony.display();
            System.out.println();
        }

        System.out.println("--------------------------------");

    }

}

