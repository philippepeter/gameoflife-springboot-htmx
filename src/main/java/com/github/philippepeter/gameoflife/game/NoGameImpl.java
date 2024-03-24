package com.github.philippepeter.gameoflife.game;

import java.util.Random;

/**
 * Dummy implementation for demo before the beginning of the Kata.
 */
public class NoGameImpl implements Game {
    private boolean[] grid;
    private int index = 0;

    @Override
    public boolean[] convertFromFrontRendering() {
        return grid;
    }

    @Override
    public void reset() {
        grid = new boolean[15 * 15];
        Random random = new Random();
        for (int i = 0; i < grid.length; i++) {
            grid[i] = random.nextInt(100) < 10;
        }

    }

    @Override
    public void next() {
        grid[index] = true;
        index++;
    }
}
