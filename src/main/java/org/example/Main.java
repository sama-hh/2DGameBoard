package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] coordinates = {2,2};

        System.out.println(Arrays.toString(move(coordinates, 'D')));
        System.out.println(Arrays.toString(move(coordinates, 'W')));
        System.out.println(Arrays.toString(move(coordinates, 'S')));
        System.out.println(Arrays.toString(move(coordinates, 'A')));

    }

    public static int[] move(int[] coordinates, char direction) {
        switch (direction) {
            case 'W': {
                coordinates = new int[]{coordinates[0], coordinates[1] + 1};
                return coordinates;
            }
            case 'S': {
                coordinates = new int[]{coordinates[0], coordinates[1] - 1};
                return coordinates;
            }
            case 'A': {
                coordinates = new int[]{coordinates[0] - 1, coordinates[1]};
                return coordinates;
            }
            case 'D': {
                coordinates = new int[]{coordinates[0] + 1, coordinates[1]};
                return coordinates;
            }
        }

        return coordinates;
    }

}