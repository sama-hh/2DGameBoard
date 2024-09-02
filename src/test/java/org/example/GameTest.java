package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
    @Test
    void game_enterDExpectsMoveRight(){
        //Given
        char moveChar = 'D';
        int[] coordinates = new int[]{0,0};
        int[] expCoordinates = new int[]{1,0};
        //When
        int[] actCoordinates = Main.move(coordinates,moveChar);
        //Then
        Assertions.assertArrayEquals(expCoordinates, actCoordinates);
    }
}
