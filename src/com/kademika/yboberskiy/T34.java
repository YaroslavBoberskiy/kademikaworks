package com.kademika.yboberskiy;

import java.util.Random;

/**
 * Created by YB on 18.06.2015.
 */
public class T34 extends Tank {

    private int speed = 22;
    private String color;
    private int crew;
    private int maxSpeed;
    private int x;
    private int y;
    private Direction direction;
    private ActionField af;
    private BattleField bf;


    public T34 (ActionField af, BattleField bf, String color, int crew, int maxSpeed) {
        super(af, bf, 64, 0, Direction.RIGHT);
        this.color = color;
        this.crew = crew;
        this.maxSpeed = maxSpeed;
    }

}
