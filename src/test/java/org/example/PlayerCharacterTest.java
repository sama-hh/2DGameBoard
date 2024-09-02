package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayerCharacterTest {

    @Test
    void getX_expect0(){
        //Given
        int expected = 0;
        //When
        int actual = PlayerCharacter.getX();
        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getY_expect0(){
        //Given
        int expected = 0;
        //When
        int actual = PlayerCharacter.getY();
        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void move_whenWExpectYIs1(){
        //Given
        char direction = 'W';
        //When
        int[] actualCoords = PlayerCharacter.move(direction,new int[]{0,0});
        //Then
        Assertions.assertEquals(actualCoords[0], 0);
        Assertions.assertEquals(actualCoords[1], 1);
    }

    @Test
    void move_whenSExpectYIsMinus1(){
        //Given
        char direction = 'S';
        //When
        int[] actualCoords = PlayerCharacter.move(direction,new int[]{0,0});
        //Then
        Assertions.assertEquals(actualCoords[0], 0);
        Assertions.assertEquals(actualCoords[1], -1);
    }
    @Test
    void move_whenDExpectXIs1(){
        //Given
        char direction = 'D';
        //When
        int[] actualCoords = PlayerCharacter.move(direction,new int[]{0,0});
        //Then
        Assertions.assertEquals(actualCoords[0], 1);
        Assertions.assertEquals(actualCoords[1], 0);
    }
    @Test
    void move_whenAExpectXIsMinus1(){
        //Given
        char direction = 'A';
        //When
        int[] actualCoords = PlayerCharacter.move(direction,new int[]{0,0});
        //Then
        Assertions.assertEquals(actualCoords[0], -1);
        Assertions.assertEquals(actualCoords[1], 0);
    }
}


