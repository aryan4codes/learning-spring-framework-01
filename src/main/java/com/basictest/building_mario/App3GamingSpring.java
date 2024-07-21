package com.basictest.building_mario;
import com.basictest.building_mario.GameRunner;
import com.basictest.building_mario.game.SuperContraGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.basictest.building_mario.game")   // we have to tell spring to scan for components by providing package path
public class App3GamingSpring {
//
    @Bean
    public GameRunner gameRunner(GamingConsole  game){
        var gameRunner = new GameRunner(game);
        return gameRunner;

    }
    public static void main(String[] args) {



        try(var context =
                    new AnnotationConfigApplicationContext
                            (App3GamingSpring.class);) {
//            context.getBean(GamingConsole.up());
            context.getBean(GameRunner.class).run();
        }
    }
}
