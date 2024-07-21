package com.basictest.building_mario.game;

import com.basictest.building_mario.GamingConsole;
import org.springframework.stereotype.Component;

@Component  //Spring will manage
public class SuperContraGame implements GamingConsole {
    public void up(){
        System.out.println("up");
    }
    public void down(){
        System.out.println("down");
    }
    public void left(){
        System.out.println("left");
    }
    public void right(){
        System.out.println("right");
    }

}
