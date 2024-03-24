package com.github.philippepeter.gameoflife.springboot;

import com.github.philippepeter.gameoflife.game.Game;
import com.github.philippepeter.gameoflife.game.NoGameImpl;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GridController {

    private final Game game = new NoGameImpl(); // Change the implementation here.

    @PostMapping(value = "/reset", produces = MediaType.TEXT_HTML_VALUE)
    public String reset() {
        game.reset();
        return displayGrid();
    }


    @PostMapping(value = "/next", produces = MediaType.TEXT_HTML_VALUE)
    public String next() {
        game.next();
        return displayGrid();
    }

    private String displayGrid() {
        return "<div id=\"grid-container\" class=\"grid-container\">" + convertGrid(game) + "</div>";
    }

    private String convertGrid(Game game) {
        String toReturn = "";
        boolean[] cells = game.convertFromFrontRendering();
        int size = (int) Math.sqrt(cells.length);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                String cell = cells[j * size + i] ? "active" : "cell";
                toReturn += "<div class=\"" + cell + "\"></div>\n";
            }
        }

        return toReturn;
    }
}
