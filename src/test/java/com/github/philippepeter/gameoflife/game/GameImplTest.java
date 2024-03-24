package com.github.philippepeter.gameoflife.game;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameImplTest {

    @Test
    void startTDDHere() {
        GameImpl game = new GameImpl();

        Assertions.assertTrue(game instanceof Game);
    }

}