package com.kademika.yboberskiy;

import java.util.Random;

/**
 * Created by YB on 18.06.2015.
 */
public class BT7 extends Tank {

    private int speed;
    private String color;
    private int crew;
    private int maxSpeed;
    private int x;
    private int y;
    private Direction direction;
    private ActionField af;
    private BattleField bf;


    public BT7 (ActionField af, BattleField bf, String color, int crew, int maxSpeed) {
        super(af, bf, 0, 256, Direction.DOWN);
        this.color = color;
        this.crew = crew;
        this.maxSpeed = maxSpeed;
        speed = 5;
    }

}
