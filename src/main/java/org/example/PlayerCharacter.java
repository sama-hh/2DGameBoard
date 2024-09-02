package org.example;

import java.util.Arrays;

public class PlayerCharacter {
    public static void main(String[] args) {
        System.out.println(getX());
        System.out.println(getY());
        int x = 0, y = 0;
        System.out.println(Arrays.toString(move('W', new int[]{x, y})));
        System.out.println(Arrays.toString(move('S', new int[]{x, y})));
        System.out.println(Arrays.toString(move('A', new int[]{x, y})));
        System.out.println(Arrays.toString(move('D', new int[]{x, y})));
    }

    public static int getX() {
        return 0;
    }

    public static int getY(){
        return 0;
    }

    public static int[] move (char direction, int[] coord){
        //step up
        if (direction == 'W') {
            coord[1] = coord[1] + 1;
        }
        //step down
        else if (direction == 'S') {
            coord[1] = coord[1] - 1;
        }
        //step left
        else if (direction == 'A') {
            coord[0] = coord[0] - 1;
        }
        //step right
        else if (direction == 'D') {
            coord[0] = coord[0] + 1;
        }
        return coord;
    }
}
