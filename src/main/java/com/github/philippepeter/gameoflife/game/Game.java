package com.github.philippepeter.gameoflife.game;

public interface Game {

    boolean[] convertFromFrontRendering();

    void reset();

    void next();
}
