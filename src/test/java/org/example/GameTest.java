package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
    @Test
    void move_enterDExpectsMoveRight(){
        //Given
        char moveChar = 'D';
        int[] coordinates = new int[]{0,0};
        int[] expCoordinates = new int[]{1,0};
        //When
        int[] actCoordinates = Main.move(coordinates,moveChar);
        //Then
        Assertions.assertArrayEquals(expCoordinates, actCoordinates);
    }

    @Test
    void move_enterAExpectsMoveLeft(){
        //Given
        char moveChar = 'A';
        int[] coordinates = new int[]{0,0};
        int[] expCoordinates = new int[]{-1,0};
        //When
        int[] actCoordinates = Main.move(coordinates,moveChar);
        //Then
        Assertions.assertArrayEquals(expCoordinates, actCoordinates);
    }

    @Test
    void move_enterSExpectsMoveDown(){
        //Given
        char moveChar = 'S';
        int[] coordinates = new int[]{0,0};
        int[] expCoordinates = new int[]{0,-1};
        //When
        int[] actCoordinates = Main.move(coordinates,moveChar);
        //Then
        Assertions.assertArrayEquals(expCoordinates, actCoordinates);
    }

    @Test
    void move_enterWExpectsMoveUp(){
        //Given
        char moveChar = 'W';
        int[] coordinates = new int[]{0,0};
        int[] expCoordinates = new int[]{0,1};
        //When
        int[] actCoordinates = Main.move(coordinates,moveChar);
        //Then
        Assertions.assertArrayEquals(expCoordinates, actCoordinates);
    }
}


