package com.basictest.building_mario;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private GamingConsole game;

    public GameRunner(@Qualifier("SuperContraQualifier") GamingConsole game) {
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
