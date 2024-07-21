package com.basictest.building_mario;

import com.basictest.building_mario.game.SuperContraGame;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    void run(){
        System.out.println("Running Game :"+game);
        game.up();
        game.down();
        game.left();
        game.right();

    }
}
