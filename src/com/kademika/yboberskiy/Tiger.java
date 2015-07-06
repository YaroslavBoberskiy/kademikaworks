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

    public Tiger (ActionField af, BattleField bf, int x, int y, Direction direction) {
        super(af, bf, x, y, Direction.LEFT);
        armor = 1;
    }

}
