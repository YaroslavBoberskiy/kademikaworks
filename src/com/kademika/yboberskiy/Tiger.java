package com.kademika.yboberskiy;

import java.util.Random;

/**
 * Created by YB on 18.06.2015.
 */
public class Tiger extends Tank {

    private int armor;
    private String color;
    private int crew;
    private int maxSpeed;
    private int x;
    private int y;
    private Direction direction;
    private ActionField af;
    private BattleField bf;

    public Tiger (ActionField af, BattleField bf, String color, int crew, int maxSpeed) {
        super(af, bf, 256, 0, Direction.UP);
        this.color = color;
        this.crew = crew;
        this.maxSpeed = maxSpeed;
        armor = 1;
    }

}
