package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayerCharacterTest {
    @Test
    void getX_expect0(){
        //Given
        int x = 0;
        int expected = 0;
        //When
        int actual = PlayerCharacter.getX();
        //Then
        Assertions.assertEquals(expected, actual);
    }

}


