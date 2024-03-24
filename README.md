# Game of life TDD Kata in springboot and htmx

The springboot + htmx code is prepare and the goal is only to implement the GameImpl in TDD according the Conway's game
of life rules:

- Any live cell with fewer than two live neighbours dies, as if caused by underpopulation.
- Any live cell with two or three live neighbours lives on to the next generation.
- Any live cell with more than three live neighbours dies, as if by overpopulation.
- Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.

1- First run without any change and try the front end.
2- Change NoGameImpl to the GameImpl in GridController
3- Run mvn test the first test should fail.

Note: To change the grid size, the css grid-container must be updated.